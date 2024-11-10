package LambdaExpression;

interface Addable {
    int calculation(int firstNumber, int SecondNumber);

}

class Add implements Addable {
    @Override
    public int calculation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}

public class LambdaWithParameters {
    public static void main(String[] args) {

        Addable addable = (firstNumber, secondNumber) -> {
            int result = (firstNumber + secondNumber);
            return (result);

        };


    }


}
