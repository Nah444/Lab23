package com.company;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userNum;

        //input

        System.out.print("Please enter an integer between 1-100: ");
        userNum = scan.nextInt();

        //output and processing

        if ((userNum < 60) && (userNum % 2 != 0)) {
            System.out.println(userNum + " odd");

        } else if ((userNum <= 25) && (userNum >= 2) && (userNum % 2 == 0)) {
            System.out.println(" even and less than 25 ");

        } else if ((userNum % 2 == 0) && (userNum >= 26) && (userNum <= 60)) {
            System.out.println(userNum + ": even");

        } else if ((userNum % 2 == 0) && (userNum > 60)) {
            System.out.println(userNum + ": even");

        } else if ((userNum % 2 == 1) && (userNum > 60)) {
            System.out.println(userNum + ":Odd and over 60");
        }
    }
}