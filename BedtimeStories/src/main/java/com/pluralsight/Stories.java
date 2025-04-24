package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stories {

    public static void main(String[] args) {
        try
        {
            System.out.println("Hello! Please choose a story. " +
                    "\nGoldilocks, " +
                    "Hansel and Gretel, " +
                    "or Mary had a little lamb.");
        FileInputStream fis = new FileInputStream("DataFiles/goldilocks.txt");
        Scanner scanner = new Scanner(fis);
        String input;
        String userInput;

            System.out.print("Enter the name of a story: ");
            userInput = scanner.nextLine();

            if (userInput.equals("goldilocks.txt")) {
                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
            }




        }
        catch (IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
