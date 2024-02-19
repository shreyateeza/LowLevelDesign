package LLD1.ExceptionHandling;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.divide("10", null);
        calculator.x = 10;
        calculator = null;
    }
}
