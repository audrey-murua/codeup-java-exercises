package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());

        Measurable myShapeSquare = new Square(5);
        System.out.println("Perimeter: " + myShapeSquare.getPerimeter());
        System.out.println("Area: " + myShapeSquare.getArea());

        Measurable myShapeRectangle = new Rectangle(5, 4);
        System.out.println("Perimeter: " + myShapeRectangle.getPerimeter());
        System.out.println("Area: " + myShapeRectangle.getArea());

    }

}
