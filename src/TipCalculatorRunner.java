import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class TipCalculatorRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> foodList = new ArrayList<String>();

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("What is your name? ");
        String name = sc.nextLine(); // stores name of user

        System.out.print("Hello " + name + "!" + " How many people are in your group today?: ");
        int people = sc.nextInt(); // stores number of people in the group

        System.out.print("What tip percentage would you like to give? (0-100): ");
        double tip = sc.nextDouble(); // stores tip

        TipCalculator calc = new TipCalculator(people, tip);

        String food;
        double foodCost = 0;

        while (foodCost != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            foodCost = sc.nextDouble();
            sc.nextLine();
            if (foodCost != -1) {
                calc.addMeal(foodCost);
                System.out.print("Enter the item: ");
                food = sc.nextLine();
                foodList.add(food);
            }
        }

        System.out.println("----------------------------------");
        System.out.printf("Total bill before tip : $%.2f \n", calc.getTotalBillBeforeTip());
        System.out.println("Total percentage: " + calc.getTipPercentage() + "%");
        System.out.printf("Total tip: $%.2f ", calc.tipAmount());
        System.out.printf("\nTotal bill with tip: $%.2f ", calc.totalBill());
        System.out.printf("\nPer person cost before tip: $%.2f ", calc.perPersonCostBeforeTip());
        System.out.printf("\nTip per person: $%.2f ", calc.perPersonTipAmount());
        System.out.printf("\nTotal cost per person: $%.2f ", calc.perPersonTotalCost());
        System.out.println("\n----------------------------------");

        System.out.println("Items ordered: ");
        for (String j : foodList) {
            System.out.println(j);
        }
        System.out.println("----------------------------------");
    }
}
