package main.figures;

import main.figures.exception.FiguresErrorCode;
import main.figures.exception.FiguresException;

import java.util.Objects;

public class Circle {
    private int radius;
    private Point center;

    public Circle(Point center, int radius) {
        setRadius(radius);
        setCenter(center);
    }

    public Circle(int xCenter, int yCenter, int radius) {
        setRadius(radius);
        this.center = new Point(xCenter, yCenter);
    }

    public Circle(int radius) {
        setRadius(radius);
        this.center = new Point(0, 0);
    }

    public Circle() {
        setRadius(1);
        this.center = new Point(0, 0);
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = new Point(center.getX(),center.getY());
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void moveRel(int dx, int dy) {center.moveRel(dx, dy);}

    public void moveTo(int x, int y) {
        center.moveTo(x, y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void resize(int ratio) throws FiguresException {
        if (ratio< 0 ){throw new FiguresException(FiguresErrorCode.CIRCLE_WRONG_RATIO);}
        setRadius(radius * ratio);
    }

    public double getArea() {return Math.PI * Math.pow(radius, 2);}

    public double getPerimeter() {return Math.PI * radius * 2;}

    public boolean isInside(int x, int y) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return Math.pow(dx, 2) + Math.pow(dy, 2) <= Math.pow(radius, 2);
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }
}

