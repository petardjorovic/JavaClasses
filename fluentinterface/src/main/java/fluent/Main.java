package fluent;

public class Main {
    public static void main(String[] args) {
        Student s = new Student()
                            .setForename("Pera")
                            .setLastname("Peric")
                            .setIndex("1940");

        System.out.println(s);
    }
}