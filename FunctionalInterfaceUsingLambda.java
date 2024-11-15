package FunctionalInterface;


import java.util.function.Function;

class FunctionalUsingLambda implements Function<String, Integer> {


    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionalInterfaceUsingLambda {

    public static void main(String[] args) {


        Function<String, Integer> function = (String s) -> s.length();
        System.out.println(function.apply("Barath"));

    }
}
