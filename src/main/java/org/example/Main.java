package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MENU_EXIT_OPTION = 5;

        int choice;

        do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    //do something
                    break;

                case 2:
                    //do something
                    break;

                case 3:
                    System.out.println("Sum 2 numbers");
                    System.out.println("Ingrese un número int y luego presione ENTER:");
                    var n1 = input.nextInt();
                    System.out.println("Ingrese otro número int y luego presione ENTER:");
                    var n2 = input.nextInt();
                    int sum = n1 + n2;
                    System.out.println("La suma es: " + sum);
                    break;

                case 4:
                    //do something
                    break;

                case 5:
                    System.out.println("Bye.. Que la Fuerza te acompañe");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid option! Please select correct option.");

            }
        } while (choice != MENU_EXIT_OPTION);
    }

    private static void printMenu() {
        System.out.println("Main Menu\n");
        System.out.print("1. Create something \n");
        System.out.print("2. Modify something.\n");
        System.out.print("3. Sum 2 numbers.\n");
        System.out.print("4. Some option.\n");
        System.out.print("5. Exit\n");
        System.out.print("\nEnter your choice: ");
    }
}