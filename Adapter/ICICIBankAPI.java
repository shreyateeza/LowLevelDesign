package LLD2.Adapter;

public class ICICIBankAPI {
    public double checkBalance(String userToken){
        return 1000;
    }

    public int transferMoney(String fromUser, String toUser, double amount){
        return 1;
    }

    public boolean changePin(String userToken, int newPin, int currentPin){
        return true;
    }
}
