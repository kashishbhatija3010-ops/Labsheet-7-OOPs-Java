import shapes.*;
class AreaPrinter {
    public void print(String name, Shape shape) {
        System.out.println("Area of " + name + " = " + shape.area());
    }
}
public class Q2_ShapesDemo {
    public static void main(String[] args) {
        AreaPrinter printer = new AreaPrinter();
        printer.print("Circle", new Circle(5));
        printer.print("Rectangle", new Rectangle(4, 6));
    }
}
