package LLD1.Synchronization;

public class Main {
    public static void main(String[] args){

        MessagePrinter messagePrinter = new MessagePrinter();
        for(int i: messagePrinter.work()){
            System.out.println(i);
        }

        Thread t1 = new Thread(messagePrinter);
        Thread t2 = new Thread(messagePrinter);
        Thread t3 = new Thread(messagePrinter);
        Thread t4 = new Thread(messagePrinter);
        Thread t5 = new Thread(messagePrinter);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
