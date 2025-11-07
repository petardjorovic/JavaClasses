package interfaces;

public class Tiger extends Cat implements SwimmingAbility {
    public Tiger(String name, String color){
        super(name, color);
    }

    @Override
    public String makeNoise(){
        return "roar";
    }

    public void swim(){
        System.out.println(getName() + " is swimming... " + makeNoise());
    }
}
