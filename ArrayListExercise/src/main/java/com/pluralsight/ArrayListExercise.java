package com.pluralsight;

import java.util.ArrayList;

public class ArrayListExercise {

    public static void main(String[] args) {


        ArrayList<String> books = new ArrayList<>();
        books.add("The Boxcar Kids");
        books.add("The Hunger Games");
        books.add("Junie B. Jones");
        books.add("Harold Potter");

        System.out.println(books);
        books.remove(2);
        System.out.println(books);
        System.out.println(books.get(1));



    }
}
