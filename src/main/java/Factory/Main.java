package main.java.Factory;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid number of arguments passed, expected either duck, dog or car");
            System.exit(1);
        }

        ToyFactory factory = new ToyFactory();
        String toyType = args[0].toLowerCase();
        Toy toy = factory.createToy(toyType);
        System.out.printf("The toy makes the noise: %s", toy.sound());
    }
}
