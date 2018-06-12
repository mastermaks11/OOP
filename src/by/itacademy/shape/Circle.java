package by.itacademy.shape;

/**
 * Created by user on 06.06.2018.
 */
public class Circle extends Shape {
    public Circle(Point pointOne, Point pointTwo) {
        super(pointOne, pointTwo, "by.itacademy.shape.Circle");
    }

    @Override
    public void areaShape() {
        double area = Math.PI * Math.pow(super.vectorShape(super.getPointOne(), super.getPointTwo()), 2);
        System.out.println("by.itacademy.shape.Shape  - " + this.getShapeName() + " Area " + " = " + area);
    }
}
