package com.bridgelabz;

import java.awt.Point;

public class LineSegment implements Comparable<LineSegment> {
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public int compareTo(LineSegment otherLine) {
        double thisLength = this.getLength();
        double otherLength = otherLine.getLength();
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

