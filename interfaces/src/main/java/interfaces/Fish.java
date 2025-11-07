package interfaces;

public class Fish extends Animal implements SwimmingAbility {
    public Fish(String name, String color){
        super(name, color);
    }

    @Override
    public String makeNoise(){
        return "";
    }

    public void swim(){
        System.out.println(getName() + " is swimming...");
    }
}
