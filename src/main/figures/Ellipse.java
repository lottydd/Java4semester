package main.figures;

import java.util.Objects;

public class Ellipse {
    private int x, y;
    private main.figures.Point center;

    public Ellipse(main.figures.Point center, int xAxis, int yAxis) {
        this.x = xAxis;
        this.y = yAxis;
        this.center = (new main.figures.Point(center.getX(), center.getY()));
    }


    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this.x = xAxis;
        this.y = yAxis;
        this.center = (new main.figures.Point(xCenter, yCenter));
    }


    public Ellipse(int xAxis, int yAxis) {
        this.x = xAxis;
        this.y = yAxis;
        this.center = (new main.figures.Point(0, 0));
    }

    public Ellipse() {
        this.x = 1;
        this.y = 1;
        this.center = (new main.figures.Point(0, 0));
    }

    public main.figures.Point getCenter() {
        return center;
    }

    public int getXAxis() {
        return x;
    }

    public int getYAxis() {
        return y;
    }

    public void setXAxis(int xAxis) {
        this.x = xAxis;
    }


    public void setYAxis(int yAxis) {
        this.y = yAxis;
    }


    public void setCenter(main.figures.Point center) {
        this.center = center;
    }

    public void moveTo(int x, int y) {
        setCenter(new main.figures.Point(x, y));
    }


    public void moveTo(main.figures.Point point) {
        setCenter(new main.figures.Point(point.getX(), point.getY()));
    }


    public void moveRel(int dx, int dy) {
        setCenter(new main.figures.Point(center.getX() + dx, center.getY() + dy));
    }

    public void resize(int ratio) {
        setXAxis(x * ratio);
        setYAxis(y * ratio);
    }

    public double getArea() {
        return Math.PI * (x * y) / 4;
    }


    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(getXAxis(), 2) + Math.pow(getYAxis(), 2)) / 8);
    }

    public boolean isInside(int x, int y) {

        double a = this.x / 2;
        double b = this.y / 2;
        x -= center.getX();
        y -= center.getY();
        return ((x * x) / (a * a) + (y * y) / (b * b) <= 1.);

    }

    public boolean isInside(main.figures.Point point) {
        double a = x / 2;
        double b = y / 2;
        double x1 = point.getX();
        double y1 = point.getY();
        x1 -= center.getX();
        y1 -= center.getY();
        return ((x1 * x1) / (a * a) + (y1 * y1) / (b * b) <= 1.);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return x == ellipse.x && y == ellipse.y && Objects.equals(center, ellipse.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, center);
    }
}