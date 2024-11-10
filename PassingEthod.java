package LambdaExpression;

interface ShapeForMethod {
    void shape();

}


public class PassingEthod {


    public static void main(String[] args) {
        print(() -> System.out.println("Rectangle shape has created"));
        print(() -> System.out.println("Circle has created"));
        print(() -> System.out.println("Triangle has created"));
    }

    public static void print(Shape shape) {
        shape.draw();
    }
}
