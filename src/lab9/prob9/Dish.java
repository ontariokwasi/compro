package lab9.prob9;
import java.util.*;
import java.util.stream.Collectors;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    //a. Is there any Vegetarian meal available ( return type boolean)
    public static boolean hasVegetarian() {
    	Optional<Dish> veg = menu.stream()
    			.filter(Dish::isVegetarian)
    			.findAny();
    	return veg.isPresent();
    }
    //b. Is there any healthy menu have calories less than 1000 ( return type boolean)
    public static boolean hasHealthy() {
    	Optional<Dish> healthy = menu.stream()
    			.filter(d -> d.getCalories() < 1000)
    			.findAny();
    	return healthy.isPresent();
    }
    //c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
    public static boolean hasUnhealthy() {
    	Optional<Dish> unhealthy = menu.stream()
    			.filter(d -> d.getCalories() > 1000)
    			.findAny();
    	return unhealthy.isPresent();
    }
    //d. find and return the first item for the type of MEAT( return type Optional<Dish>)
    public static Optional<Dish>firstMeat(){
    	Optional<Dish> firstMeat = menu.stream()
    			.filter(d -> d.getType().equals(Type.MEAT))
    			.findFirst();
    	return firstMeat;
    }
    //e. calculateTotalCalories() in the menu using reduce. (return int)
    public static int calculateTotalCalories() {
    	Optional<Integer> totalCalories = menu.stream()
    			.map(Dish::getCalories)
    			.reduce((d1,d2)->d1+d2);
		/*
		 * if(totalCalories.isPresent()) return totalCalories.get(); else return 0;
		 */
    	return totalCalories.orElse(0);
    }
    //f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
    public static int calculateTotalCaloriesMethodReference() {
    	int totalCalories = menu.stream()
    			.collect(Collectors.summingInt(Dish::getCalories));
    	return totalCalories;
    }
    //g. Implement a main method to test.
    public static void main(String ...args) {
    	System.out.println("Menu has vegetarian: "+hasVegetarian());
    	System.out.println("Menu has Healthy: "+hasHealthy());
    	System.out.println("Menu has Unhealthy: "+hasUnhealthy());
    	System.out.println("First item for type MEAT: "+firstMeat().orElse(null));
    	System.out.println("Total Calories using reduce: "+calculateTotalCalories());
    	System.out.println("Total Calories using Method Reference: "+calculateTotalCaloriesMethodReference());
    }
    
}