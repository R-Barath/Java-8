package LambdaExpression;

@FunctionalInterface
interface Shape {
    void draw();
}

public class LambdaExample {

    public static void main(String[] args) {

        Shape rectangle = () -> System.out.println("Rectangle shape method");
        rectangle.draw();

        Shape circle = () -> System.out.println("Circle shape method");
        circle.draw();

        Shape triangle = () -> System.out.println("Triangle shape method");
        triangle.draw();
    }

}


