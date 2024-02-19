package LLD2.Adapter;

public class PhonePe {
    private BankAPIAdapter bankAPIAdapter;

    public PhonePe() {
        this.bankAPIAdapter = new ICICIBankAPIAdapter();
        // this.bankAPIAdapter = new YesBankAPIAdapter();
    }

    public void checkBalance(User user){
        double d = bankAPIAdapter.checkbalance(user);
        System.out.println("Balance = " + d);
    }

    public void transferMoney(User fromUser, User toUser, double amount){
        if(bankAPIAdapter.checkbalance(fromUser) < amount){
            System.out.println("Transaction failed");
        }
        int status = bankAPIAdapter.doTransaction(fromUser, toUser, amount);
        switch (status){
            case 1:
                System.out.println("Successful!");
                break;
            case 0:
                System.out.println("Failed!");
                break;
            default:
                System.out.println("In Progress!");
                break;
        }
    }

}
