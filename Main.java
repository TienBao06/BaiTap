public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0, "blue", false);
        Shape shape2 = new Rectangle(3.0, 4.0, "green", true);
        Shape shape3 = new Square(6.0, "yellow", false);

        System.out.println(shape1);
        System.out.println("Area: " + shape1.getArea() + ", Perimeter: " + shape1.getPerimeter());

        System.out.println(shape2);
        System.out.println("Area: " + shape2.getArea() + ", Perimeter: " + shape2.getPerimeter());

        System.out.println(shape3);
        System.out.println("Area: " + shape3.getArea() + ", Perimeter: " + shape3.getPerimeter());
    }
}