package com.company;

import java.util.Scanner;

/**
 * Made By Nick
 */

public class Lab1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Room Detail Generator!");

        double length;
        double width;
        double area;
        double perimeter;
        double yes;






            System.out.println("Enter Length: ");
            length = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter Width: ");
            width = scan.nextDouble();
            scan.nextLine();

            area = (length + width) * 2;
            perimeter = (length * 2 + width * 2);

            System.out.println("Area = " + area);
            System.out.println("Perimeter = " + perimeter);

            System.out.println("Select yes to continue");
            yes = scan.nextDouble();
            scan.nextLine();






        }


    }




