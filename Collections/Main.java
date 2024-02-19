package LLD1.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        Student shreya = new Student(1, "Shreya Prasad");
        Student shreyansh = new Student(2,"Shreyansh Saha");
        System.out.println(shreya.hashCode());
        System.out.println(shreyansh.hashCode());
        System.out.println(shreya.hashCode() == shreyansh.hashCode());
        System.out.println(shreya.equals(shreyansh));

        HashSet<Student> set = new HashSet<>();
        set.add(shreya);
        set.add(shreyansh);
        System.out.println(set);

        Count c1 = new Count(10);
        Count c2 = new Count(10);
        System.out.println(c1.equals(c2));

    }
}
