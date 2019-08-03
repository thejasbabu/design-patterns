package main.java.Builder;

class NonVegMealBuilder extends MealBuilder {
    private Meal meal;

    NonVegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    void addName() {
        this.meal.name = "Non-veg meal";
    }

    @Override
    void addStarter() {
        this.meal.starter = "Non-Veg starter";
    }

    @Override
    void addDrink() {
        this.meal.drink = "Pepsi";
    }

    @Override
    void addMainCourse() {
        this.meal.mainCourse = "Non-Veg main dish";
    }

    @Override
    void addDessert() {
        this.meal.dessert = "Non-Veg dessert";
    }

    @Override
    void addPrice() {
        this.meal.price = "$10";
    }

    @Override
    Meal getMeal() {
        return this.meal;
    }
}
