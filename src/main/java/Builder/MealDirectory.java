package main.java.Builder;

class MealDirectory {
    Meal makeMeal(MealBuilder builder) {
        builder.addName();
        builder.addStarter();
        builder.addDrink();
        builder.addMainCourse();
        builder.addDessert();
        builder.addPrice();
        return builder.getMeal();
    }
}
