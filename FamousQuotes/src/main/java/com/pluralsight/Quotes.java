package com.pluralsight;

import java.util.Scanner;

public class Quotes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Choose a number between 1-10 to read a quote!");
            int num = scanner.nextInt();

            String[] quotes = {"\"The only thing we have to fear is fear itself.\" - Franklin D. Roosevelt",
                    "\"The journey of a thousand miles begins with a single step.\" - Lao Tzu",
                    "\"Be the change that you wish to see in the world.\" - Mahatma Gandhi",
                    "\"I have no special talent. I am only passionately curious.\" - Albert Einstein",
                    "\"No one can make you feel inferior without your consent.\" - Eleanor Roosevelt",
                    "\"A friend in need is a friend indeed.\" - Unknown",
                    "\"What you do today can improve all your tomorrows.\" - Ralph Marston",
                    "\"Believe you can and you’re halfway there.\" – Theodore Roosevelt",
                    "\"Start where you are. Use what you have. Do what you can.\" – Arthur Ashe",
                    "\"You miss 100% of the shots you don't take.\" – Wayne Gretzky"
            };


            System.out.println(quotes[num - 1]);
        }
        catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
        scanner.close();


    }
}
