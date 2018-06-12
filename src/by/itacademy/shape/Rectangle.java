package by.itacademy.shape;

import by.itacademy.shape.Point;
import by.itacademy.shape.Shape;

/**
 * Created by user on 06.06.2018.
 */
public class Rectangle extends Shape {
    private Point pointThree;
    private Point pointFour;

    public Rectangle(Point pointOne, Point pointTwo, Point pointThree) {
        super(pointOne, pointTwo, "Rectanle");
        this.pointThree = pointThree;
        this.pointFour = new Point(pointThree.getCoordinateY(), pointOne.getCoordinateY());
    }

    @Override
    public void areaShape() {
        if (this.pointThree.getCoordinateY() == super.getPointTwo().getCoordinateY()) {
            double area = super.vectorShape(super.getPointOne(), super.getPointTwo()) * super.vectorShape(super.getPointTwo(), this.pointThree);
            System.out.println("by.itacademy.shape.Shape  - " + this.getShapeName() + " Area " + " = " + area);
        } else
            System.out.println("По данным координатам нельзя создать прямоугольник");
    }
}
