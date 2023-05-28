package EncapsulationExersice.pizza;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] pizzaProperties = scanner.nextLine().split(" ");
            String[] doughProperties = scanner.nextLine().split(" ");
            Pizza pizza = new Pizza(pizzaProperties[1],Integer.parseInt(pizzaProperties[2]));
            Dough dough = new Dough(doughProperties[1], doughProperties[2], Integer.parseInt(doughProperties[3]));
            pizza.setDough(dough);
            String command = scanner.nextLine();
            while (!command.equals("END")) {
                String[] toppingProperties= command.split(" ");
                Topping topping = new Topping(toppingProperties[1], Integer.parseInt(toppingProperties[2]));
                pizza.addTopping(topping);
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(),pizza.getOverallCalories());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
