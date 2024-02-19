package LLD1.InheritanceAndPolymorphism;

public class Animal {
    public String furColor;
    public String eyeColor;
    public int noOfLegs;

    @Override
    public String toString() {
        return "Animal{" +
                "furColor='" + furColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", noOfLegs=" + noOfLegs +
                '}';
    }
}
