package LLD2.Adapter;

public class YesBankAPI {
    public long getBalance(String username, String password){
        return 1000;
    }

    public char doTransaction(String fromUser, String toUser, String fromUserPassword, double amount){
        return 'Y';
    }

    public boolean changePin(String userName, String password, int currentPin, int newPin){
        return true;
    }
}
