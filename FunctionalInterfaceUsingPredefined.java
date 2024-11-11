package FunctionalInterface;


import java.util.function.Function;

class Functional implements Function<String, Integer> {


    @Override
    public Integer apply(String s) {
        return s.length();
    }
}


public class FunctionalInterfaceUsingPredefined {


    public static void main(String[] args) {
        Functional functional = new Functional();
        System.out.println(functional.apply("Barath"));


    }
}
