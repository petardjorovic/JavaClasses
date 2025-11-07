package interfaces;

public class Bird extends Animal implements FlyingAbility {
    public Bird(String name, String color){
        super(name, color);
    }

    @Override
    public String makeNoise(){
        return "tweety";
    }

    @Override
    public void fly(){
        System.out.println(getName() + " is flying... " + makeNoise());
    }

    @Override
    public void land(){
        System.out.println(getName() + " is landing... " + makeNoise());
    }

}
