package LLD2.Decorator;

public class ChocoChip implements IceCream{
    private IceCream iceCream;

    public ChocoChip() {
    }

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Chip.";
    }
}
