package ex14;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
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
