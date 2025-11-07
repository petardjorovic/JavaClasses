package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Tom", "crno-bela"));
        animals.add(new Fish("Nemo", "plava"));
        animals.add(new Tiger("Shircan", "crno-zuta"));
        animals.add(new Bird("Rick", "siva"));

        for (Animal animal : animals){
            if(animal instanceof ClimbingAbility){
                ((ClimbingAbility) animal).climb();
            }

            if(animal instanceof FlyingAbility){
                ((FlyingAbility) animal).fly();
                ((FlyingAbility) animal).land();
            }
            if(animal instanceof SwimmingAbility){
                ((SwimmingAbility) animal).swim();
            }
        }
    }
}