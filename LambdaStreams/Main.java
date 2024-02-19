package LLD1.LambdaStreams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t1 = new Thread();
        t1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Good Morning!");
            }
        };

        Car c = new Car() {
            @Override
            public void startEngine() {
                System.out.println("Start Engine!");
            }

            @Override
            public int startMedia() {
                System.out.println("Start Media!");
                return 0;
            }
        };

        System.out.println(c.startMedia());
        Thread t2 = new Thread(r1);
        t2.start();

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!!");
            }
        };

        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(()-> System.out.println("Hello World!!!"));
        t4.start();

        Instructor<String> i1 = new Instructor<String>() {
            @Override
            public void teach(int numberOfStudents, String batch) {
                System.out.println("Teaching student :" + numberOfStudents + " ,from batch :" + batch);
            }
        };
        i1.teach(1, "Shreya");

        Instructor<String> i2 = (noOfStudents, batchName) -> {
            System.out.println("From lambda -> Teaching student :" + noOfStudents + " ,from batch :" + batchName);
        };
        i2.teach(2 , "Tanishq");

        Instructor<String> i3 = (noOfStudents, batchName) -> {
            System.out.println("From lambda -> Teaching student :" + noOfStudents + " ,from batch :" + batchName);
        };
        i3.teach(3, "Arsh");

        Instructor<String> i4 = (noOfStudents, batchName) ->
                System.out.println("Teaching student :" + noOfStudents + " ,from batch :" + batchName);
        i4.teach(4, "Shweta");

        int x = 10;
        switch(x){
            case 1: {
                System.out.println("Case 1");
            }
            case 2: {
                System.out.println("Case 2");
            }
            case 10: {
                System.out.println("Case 3");
            }
        }

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.stream().forEach(i -> {
            if(i%2 == 0) System.out.println(i);
        });
        list.stream().forEach(e -> System.out.println(e*e));
        list.stream()
                .map(e -> e*e/2)
                .filter(e -> e%2==0)
                .forEach(e -> System.out.println(e));
        System.out.println("Print List: " + list);

        Calculator c2 = (y) -> y*y;
        System.out.println(c2);
    }
}
