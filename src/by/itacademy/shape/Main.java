package by.itacademy.shape;

import by.itacademy.shape.Circle;

/**
 * Created by user on 05.06.2018.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(0, 0), new Point(0, 5));
        Circle circle = new Circle(new Point(0, 0), new Point(0, 5));
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 5), new Point(7, 5));
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 5), new Point(7, 5));
        square.areaShape();
        circle.areaShape();
        rectangle.areaShape();
        triangle.areaShape();
    }
}
