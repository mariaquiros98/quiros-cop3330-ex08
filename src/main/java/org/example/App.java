/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int people;
        int pizzas;
        int slices;

        /*Prompting for amount of people*/
        System.out.println("How many people?");
        people = scan.nextInt();

        /*Prompting for amount of pizzas*/
        System.out.println("How many pizzas do you have?");
        pizzas = scan.nextInt();

        /*Prompting for amount of slices per pizza*/
        System.out.println("How many slices per pizza?");
        slices = scan.nextInt();

        /*Calculating total amount of slices*/
        int amountSlices = pizzas * slices;

        /*Calculating total amount of slices each person gets*/
        int amountPizza = amountSlices / people;

        /*Calculating amount of leftover slices*/
        int leftovers = amountSlices - (people * amountPizza);

        /*Displaying amount slices each person gets and amount of leftover slices*/
        System.out.printf("%d people with %d pizzas (%d slices)\n", +people, +pizzas, +amountSlices);
        System.out.printf("Each person gets %d pieces of pizza.\n", +amountPizza);
        System.out.printf("There are %d leftover pieces.", +leftovers);
    }
}
