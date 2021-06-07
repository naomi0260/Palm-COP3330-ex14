package ex14;

import java.util.Scanner;

/*
Example Output
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
Or

What is the order amount? 10
What is the state? MN
The total is $10.00
 */

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the order amount? ");
        double order = input.nextFloat();
        System.out.print("What is the state? ");
        String state = input.next();

        double tax = 0;

        double subTotal = order;
        double total;

        if(state.equals("WI")){
            tax = order * .055;
            total = tax + subTotal;
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", subTotal, tax, total);
            return;
        }

        total = order + tax;

        System.out.printf("The total is %.2f", total);

    }
}
