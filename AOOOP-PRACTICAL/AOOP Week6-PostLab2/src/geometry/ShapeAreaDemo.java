package geometry;

public class ShapeAreaDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(6, 8);
        Shape square = new Square(5);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
