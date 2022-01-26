package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input userInput = new Input();
        double radius = userInput.getDouble();
        Circle circle1 = new Circle(radius);
        double area = circle1.getArea();
        double circumference = circle1.getCircumference();

        System.out.printf("The area of your circle is %.2f and its circumference is %.2f", area, circumference);


    }

}
