package interfaces;

public class Cat extends Animal implements ClimbingAbility {
    public Cat(String name, String color){
        super(name, color);
    }

    @Override
    public String makeNoise(){
        return "meow";
    }

    public void climb(){
        System.out.println(getName() + " is climbing... " + makeNoise());
    }
}
