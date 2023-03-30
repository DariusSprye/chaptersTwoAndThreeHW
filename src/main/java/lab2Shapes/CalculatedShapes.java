package lab2Shapes;

public class CalculatedShapes {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.base = 10;
        triangle1.height = 12;
        triangle1.calculateArea();

        Square square1 = new Square();
        square1.side = 15;
        square1.calculateArea();

        Circle circle1 = new Circle();
        circle1.radius = 30;
        circle1.calculateArea();
    }

}
