package LLD1.InheritanceAndPolymorphism;

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
        a.eyeColor = "Blue";
        a.furColor = "Brown";
        a.noOfLegs = 4;
        System.out.println(a);

        Instructor i = new Instructor("Shreya", "shreyateeza@gmail.com", "ABC");
        System.out.println(i);
    }

}
