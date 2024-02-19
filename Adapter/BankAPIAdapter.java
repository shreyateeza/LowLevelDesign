package LLD2.Adapter;

public interface BankAPIAdapter {
    double checkbalance(User user);
    int doTransaction(User fromUser, User toUser, double amount);
    boolean changePin(User user, int currentPin, int newPin);
}
