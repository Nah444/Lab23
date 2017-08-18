package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {

    public static void main(String[] args) {

        do {

        Scanner scan = new
        String userWants;
        String answer;

        String[] classNames = {"Nick", "Tonya", "Holly", };
        String[] highschool = {"South Eastern", "Cass", "Denby", "King", "Finney", "Renassaince", "Osborn", "Cody", "Pershing", "DSA"};
        String[] favColor = {"mauve", "taupe", "dark brown", "dark blue", "red,", "green", "black", "aquamarine", "purple", "orange"};

        System.out.println("Welcome to TechHire 2017");
        Catch
        System.out.println("Please enter a student number to learn more (1-10):");
        Scanner scan = new Scanner(System.in);
        studentNumber = scan.nextInt();

        System.out.println("Your student is: " + classNames[studentNumber - 1]);

        System.out.println("What would you like to learn about us? Enter 'high school' or 'favorite color': ");
        userWants = scan.nextLine();
    }

        if (userWants.contains("school")) {
            System.out.println("Your student attended " + highschool[studentNumber - 1] + "high school.");

        }