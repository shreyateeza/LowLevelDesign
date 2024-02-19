package LLD1.InheritanceAndPolymorphism.Interface;

public class Main {
    public static void main(String[] args){
        PlayAnimal playAnimal = new PlayAnimal();
        playAnimal.doAnimalThings();

        Lion l = new Lion();
        
        IAnimal lionAnimal = new Lion();
    }
}

