package AbstractClassAndInterface.lopAnimalVaInterfaceEdible;

import AbstractClassAndInterface.lopAnimalVaInterfaceEdible.Edible.Edible;
import AbstractClassAndInterface.lopAnimalVaInterfaceEdible.animal.Animal;
import AbstractClassAndInterface.lopAnimalVaInterfaceEdible.animal.Chicken;
import AbstractClassAndInterface.lopAnimalVaInterfaceEdible.animal.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible=(Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
