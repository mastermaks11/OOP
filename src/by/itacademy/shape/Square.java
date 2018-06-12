package by.itacademy.shape;

import by.itacademy.shape.Point;
import by.itacademy.shape.Shape;

/**
 * Created by user on 05.06.2018.
 */
public class Square extends Shape {
    private Point pointThree;
    private Point pointFour;

    Square(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo, "by.itacademy.shape.Square");
        this.pointThree = new Point(pointTwo.getCoordinateY(), pointTwo.getCoordinateY());
        this.pointFour = new Point(pointOne.getCoordinateY(), pointTwo.getCoordinateY());
    }

    public Point getPointThree() {
        return this.pointThree;
    }

    public void areaShape() {
        double area = super.vectorShape(super.getPointOne(), super.getPointTwo()) * super.vectorShape(super.getPointTwo(), this.pointThree);
        System.out.println("by.itacademy.shape.Shape  - " + this.getShapeName() + " Area " + " = " + area);
    }
}
