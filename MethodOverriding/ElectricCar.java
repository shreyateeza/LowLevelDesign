package LLD1.MethodOverriding;

public class ElectricCar extends Car{
    @Override
    public void startEngine(){
        System.out.println("Starting Battery pack");
        System.out.println("Starting the Motor");
    }
}
