package LLD2.Decorator;

public class ChocoCone implements IceCream{
    private IceCream iceCream;

    public ChocoCone() {
    }

    public ChocoCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 20;
        }
        return 50;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + ", Chocolate Cone.";
        }
        return "Chocolate Cone!";
    }
}
