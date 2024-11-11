package FunctionalInterface;

@FunctionalInterface
interface  Shape{
    public void draw();
}

public class MyFunctionalInterface {

    public static void main(String[] args) {

Shape shape=()-> System.out.println("Lambda expression has created");
shape.draw();
    }
}
