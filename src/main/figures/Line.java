package main.figures;

import java.util.Objects;

public class Line {
    private Point startPoint;
    private Point endPoint;
    private int x;
    private int y;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint.getX(), startPoint.getY());
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }

    public Line(int xLeft, int yTop, int xRight, int yBottom) {
        this.startPoint = new Point(xLeft, yTop);
        this.endPoint = new Point(xRight, yBottom);
    }

    public Line(Point endPoint) {
        this.startPoint = new Point(0, 0);
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }

    public Line(int x, int y) {
        this.startPoint = new Point(0, 0);
        this.endPoint = new Point(x, y);
    }

    public Line() {
        this.startPoint = new Point(0, 0);
        this.endPoint = new Point(1, 1);
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setStartPoint(Point point) {
        this.startPoint = point;
    }

    public void setEndPoint(Point point) {
        this.endPoint = point;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) + Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }

    public void moveTo(int x, int y) {
        int dx = endPoint.getX() - startPoint.getX();
        int dy = endPoint.getY() - startPoint.getY();
        startPoint.moveTo(x, y);
        endPoint.moveTo(x, y);
        endPoint.moveRel(dx,dy);
        //   moveTo(new Point(x,y)); - лучше использовать что есть чем создать новое
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
       startPoint.moveRel(dx,dy);
       endPoint.moveRel(dx,dy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return x == line.x && y == line.y && Objects.equals(startPoint, line.startPoint) && Objects.equals(endPoint, line.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint, x, y);
    }
}
