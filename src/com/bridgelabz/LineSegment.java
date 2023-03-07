package com.bridgelabz;

import java.awt.Point;

public class LineSegment implements Comparable<LineSegment> {
    private Point startPoint;
    private Point endPoint;

    public LineSegment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double length() {
        double dx = endPoint.getX() - startPoint.getX();
        double dy = endPoint.getY() - startPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LineSegment)) {
            return false;
        }
        LineSegment otherLine = (LineSegment) obj;
        return startPoint.equals(otherLine.getStartPoint()) && endPoint.equals(otherLine.getEndPoint());
    }

    @Override
    public int compareTo(LineSegment otherLine) {
        double thisLength = length();
        double otherLength = otherLine.length();
        if (thisLength < otherLength) {
            return -1;
        } else if (thisLength > otherLength) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(5, 12);

        LineSegment line1 = new LineSegment(p1, p2);
        LineSegment line2 = new LineSegment(p3, p4);

        int result = line1.compareTo(line2);

        if (result < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else if (result > 0) {
            System.out.println("Line 1 is longer than Line 2");
        } else {
            System.out.println("Line 1 is the same length as Line 2");
        }
    }
}

