package LLD1.ExceptionHandling;

public class HelloWorldPrinter {
    public static int a;

    public void print(){
        try{
            Thread.sleep(1000);
            System.out.println("Hello world!");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }
    }

    public static void helloWorld() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Hello world!");
    }

}
