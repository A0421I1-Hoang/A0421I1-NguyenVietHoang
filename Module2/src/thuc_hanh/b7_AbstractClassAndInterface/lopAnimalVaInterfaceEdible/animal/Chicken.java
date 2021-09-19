package b7_AbstractClassAndInterface.lopAnimalVaInterfaceEdible.animal;

import b7_AbstractClassAndInterface.lopAnimalVaInterfaceEdible.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck_cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
