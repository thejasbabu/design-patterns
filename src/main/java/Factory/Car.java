package main.java.Factory;

public class Car implements Toy {
    @Override
    public String sound() {
        return "Honk Honk!";
    }
}
