package LLD2.Decorator;

public class ChocoScoop implements IceCream{
    private IceCream iceCream;

    public ChocoScoop() {
    }

    public ChocoScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Scoop.";
    }
}
