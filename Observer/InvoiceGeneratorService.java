package LLD2.Observer;

public class InvoiceGeneratorService implements OrderPlacedSubscriber {
    @Override
    public void orderPlaceEvent() {
        System.out.println("Generate Invoice");
    }
}