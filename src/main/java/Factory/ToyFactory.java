package main.java.Factory;

class ToyFactory {
    Toy createToy(String toyType) {
        switch (toyType) {
            case "duck": return new Duck();
            case "dog": return new Dog();
            case "car": return new Car();
            default: throw new IllegalArgumentException("Expected either duck, dog or car, but got " + toyType);
        }
    }
}
