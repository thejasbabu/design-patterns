package main.java.Factory;

class Duck implements Toy {
    @Override
    public String sound() {
        return "Quack Quack!";
    }
}
