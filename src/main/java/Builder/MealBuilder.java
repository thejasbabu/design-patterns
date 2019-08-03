package main.java.Builder;

abstract class MealBuilder {
    abstract void addName();
    abstract void addStarter();
    abstract void addDrink();
    abstract void addMainCourse();
    abstract void addDessert();
    abstract void addPrice();
    abstract Meal getMeal();
}
