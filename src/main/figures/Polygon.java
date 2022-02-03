package main.figures;

import java.util.Arrays;

public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        setPoints(points);
    }

    public Point[] getPoints() {
        Point[] pointsCopy = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            pointsCopy[i] = new Point(points[i].getX(), points[i].getY());
        }
        return pointsCopy;
    }

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 1; i < points.length; i++) {
            int dx = points[i].getX() - points[i - 1].getX();
            int dy = points[i].getY() - points[i - 1].getY();
            perimeter += Math.sqrt(dx * dx + dy * dy);
        }
            int dx = points[0].getX() - points[points.length - 1].getX();
            int dy = points[0].getY() - points[points.length - 1].getY();
        perimeter += Math.sqrt(dx * dx + dy * dy);
        return perimeter;

    }

    public void moveTo(int x, int y) {
        int dx = x - points[0].getX();
        int dy = y - points[0].getY();
        for (Point point : points) {
            point.moveRel(dx, dy);
        }
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        for (Point point : points) {
            point.moveRel(dx, dy);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return Arrays.equals(points, polygon.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}
