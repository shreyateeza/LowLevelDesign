package LLD2.Adapter;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double checkbalance(User user) {
        long balance = yesBankAPI.getBalance(user.getUserName(), user.getPassword());
        return balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char result = yesBankAPI.doTransaction(fromUser.getUserName(), toUser.getUserName(), fromUser.getPassword(), amount);
        if(result == 'Y') return 1;
        else if(result == 'N') return 0;
        return -1;
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankAPI.changePin(user.getUserName(), user.getPassword(), currentPin, newPin);
    }
}
