package LLD1.ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    public int x;

    public void divide(String a, String b){
        Scanner sc = new Scanner(System.in);

        try{
            int N = sc.nextInt();
            if(a == null || b == null){
                throw new NullPointerException("Input parameters can't be null");
            }
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println("Don't divide by Zero");
        }
        catch (NumberFormatException e){
            System.out.println("Number format in string is not correct");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
        finally {
            sc.close();
        }
    }

    public void finalise(){
        System.out.println("Calculator object is being destroyed");
    }
}
