package by.itacademy.shape;

import static java.lang.Math.pow;

/**
 * Created by user on 05.06.2018.
 */
public abstract class Shape {
    private Point pointOne;
    private Point pointTwo;
    private String nameShape;

    public Shape(Point pointOne, Point pointTwo, String nameShape) {
        this.nameShape = nameShape;
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public double vectorShape(Point point1, Point point2) {

        return Math.sqrt(pow(point1.getCoordinateX() - point2.getCoordinateX(), 2) + pow(point1.getCoordinateY() - point2.getCoordinateY(), 2));
    }

    public abstract void areaShape();

    public Point getPointOne() {
        return this.pointOne;
    }

    public Point getPointTwo() {
        return this.pointTwo;
    }

    public String getShapeName() {
        return this.nameShape;
    }

}
