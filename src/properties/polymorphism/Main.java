package properties.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes  shape = new Shapes();
        Circle circle = new Circle();
        Shapes circle1 = new Circle();
        Square square = new Square();
//        this is polymorphism, representing same area() function but for different classes
        shape.area();
        circle.area();
        circle1.area();
        square.area();
        Shapes square1 = new Square();
        square1.area();
//        Square square2 = new Shapes();

    }
}
