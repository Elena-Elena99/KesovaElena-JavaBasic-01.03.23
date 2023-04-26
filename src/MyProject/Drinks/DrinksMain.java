package MyProject.Drinks;
import MyProject.Drinks.Drinks;

import java.util.Scanner;
public class DrinksMain {
    public static void main(String[] args) {
        Drinks drink = new Drinks();
        drink.PrintDrinks();
        System.out.println("Choice drink:");
        Scanner in1 = new Scanner(System.in);
        drink.drinkName = in1.nextInt();
        while (drink.drinkName != 0) {
            if (drink.drinkName < 7) {
                System.out.print("Input a quantity: ");
                Scanner in2 = new Scanner(System.in);
                drink.quan = in2.nextInt();
                drink.Choice();
                System.out.println("Choice drink:");
                Scanner in3 = new Scanner(System.in);
                drink.drinkName = in3.nextInt();
            }else {
                System.out.println("Your choice is wrong");
                break;
            }
            }

        drink.TotalPrice();
        System.out.println("Thank you!");
    }
}


