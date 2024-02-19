package LLD1.MethodOverloading;

public class Main {
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.add(1, 2);
        c.add(1.1, 2.2);
        c.add(1.1, 2);
        c.add(1, 2.2);
    }
}
