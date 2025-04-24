package com.pluralsight;

import java.util.ArrayList;


public class SearchInventory {
    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("|id: %d | %s - Price: $%.2f%n", p.getID(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(1, "Pop Tarts", 4.99f));
        inventory.add(new Product(2, "Lays Potato Chips", 3.49f));
        inventory.add(new Product(3, "Core Water", 1.99f));
        inventory.add(new Product(4, "King's Hawaiian Rolls", 7.49f));
        inventory.add(new Product(5, "Texas Toast Garlic Bread", 4.89f));
        return inventory;
    }
}
