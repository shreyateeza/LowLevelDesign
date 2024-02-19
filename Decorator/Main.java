package LLD2.Decorator;

public class Main {
    public static void main(String[] args){
        IceCream ic = new ChocoChip(
                            new ChocoScoop(
                                new ChocoCone(
                                    new ChocoCone())));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
