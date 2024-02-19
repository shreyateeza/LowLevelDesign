package LLD1.InheritanceAndPolymorphism.Interface;

public class PlayAnimal {
    private IAnimal animal;

    public PlayAnimal(){
        animal = new Deer();
    }

    public void doAnimalThings(){
        animal.eat();
        animal.drink();
        animal.walk();
    }

}
