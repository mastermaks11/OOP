package by.itacademy.shape;

import by.itacademy.shape.Point;
import by.itacademy.shape.Shape;

public class Triangle extends Shape {
    private Point pointThree;

    public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
        super(pointOne, pointTwo, "by.itacademy.shape.Triangle");
        this.pointThree = pointThree;
    }

    @Override
    public void areaShape() {
        double poluperiment = (super.vectorShape(super.getPointOne(), super.getPointTwo()) + super.vectorShape(super.getPointTwo(), this.pointThree) + super.vectorShape(super.getPointOne(), this.pointThree)) / 2;
        double sideTriagleA = super.vectorShape(super.getPointOne(), super.getPointTwo());
        double sideTriagleB = super.vectorShape(super.getPointTwo(), this.pointThree);
        double sideTriagleC = super.vectorShape(super.getPointOne(), this.pointThree);
        double area = Math.sqrt(poluperiment * (poluperiment - sideTriagleA) * (poluperiment - sideTriagleB) * (poluperiment - sideTriagleC));
        if (Math.abs(area - 0) > 0.0000001)
            System.out.println("by.itacademy.shape.Shape  - " + this.getShapeName() + " Area " + " = " + area);
        else
            System.out.println("По данным коардинатам невозвожно создать трехугольник");
    }
}
