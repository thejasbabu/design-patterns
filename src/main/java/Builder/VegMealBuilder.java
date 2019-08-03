package main.java.Builder;

class VegMealBuilder extends MealBuilder {
    private Meal meal;

    VegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    void addName() {
        this.meal.name = "Veg meal";
    }

    @Override
    void addStarter() {
        this.meal.starter = "Veg starter";
    }

    @Override
    void addDrink() {
        this.meal.drink = "Coke";
    }

    @Override
    void addMainCourse() {
        this.meal.mainCourse = "Veg main dish";
    }

    @Override
    void addDessert() {
        this.meal.dessert = "Veg dessert";
    }

    @Override
    void addPrice() {
        this.meal.price = "$5";
    }

    @Override
    Meal getMeal() {
        return this.meal;
    }
}
