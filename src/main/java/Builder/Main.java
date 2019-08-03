package main.java.Builder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid number of arguments passed, expected input either veg or non-veg");
            System.exit(1);
        }
        String mealType = args[0].toLowerCase();
        MealBuilder mealBuilder;
        switch (mealType) {
            case "veg":
                mealBuilder = new VegMealBuilder();
                break;
            case "non-veg":
                mealBuilder = new NonVegMealBuilder();
                break;
            default:
                throw new IllegalArgumentException("Invalid meal type passed, expected veg or non-veg, but given: " + mealType);
        }
        MealDirectory directory = new MealDirectory();
        Meal meal = directory.makeMeal(mealBuilder);
        System.out.printf("Price of the  %s is %s \n", meal.name, meal.price);
    }
}
