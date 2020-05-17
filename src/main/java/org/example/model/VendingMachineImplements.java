package org.example.model;

import org.example.*;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachineImplements implements VendingMachine {
    //Items itemint = new Items();
    private static Product[] items = new Product[0];
    int pool = 0;

    public int size() {
        return items.length;
    }

    public Product[] findAll() {
        return items;
    }

    public Product addfruitProduct(String ProductName, int itemPrize, int calories) {
        Fruit item = new Fruit(1,ProductName,itemPrize,calories);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }
    public Product adddrinkProduct(String ProductName, int itemPrize,int calories,int size) {
        Drink item = new Drink(1,ProductName,itemPrize,calories,330);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }
    public Product addsweetProduct(String ProductName, int itemPrize, int calories) {
        Sweet item = new Sweet(1,ProductName,itemPrize,calories);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }

    @Override
    public void addCurrency(int amount) {
        pool = pool + amount;
        System.out.println("The credit amount in the pool is " + pool);
        System.out.println("\n");
    }

    @Override
    public Product request(int productId) {
       // Items itemint = new Items();
        Product[] arrInt = findAll();
        for (int i = 0; i < arrInt.length; i++)
            if (productId == arrInt[i].getProductId()) {
                System.out.println("The item no. you selected is " + arrInt[i].getProductId() + " item Name is " + arrInt[i].getProductName());
                int balance = pool - arrInt[i].getPrize();
                if(balance<0)
                    System.out.println("Please put more money in the VM. Your choice is below your MONEY BALANCE");
                pool = balance;
                System.out.println("Availabe balance is " + pool);
                return arrInt[i];
            }
            callmenu();
        return null;
    }

    @Override
    public void callmenu() { }

    @Override
    public int endSession() {
        System.out.println("Your balance is " + pool);
        System.out.println("You will be returned you money back (Change) in the following multiples");
        int change = pool;

        int Thousands = change / 1000;
        // change %= 100;
        change = change % 1000;

        int FiveHundreds = change / 500;
        change = change % 500;

        int TwoHundreds = change / 200;
        change = change % 200;

        int Hundreds = change / 100;

        change = change % 100;

        int Fiftys = change / 50;
        change = change % 50;

        int Twenties = change / 20;
        change = change % 20;

        int Tens = change / 10;
        change = change % 10;

        int Fives = change / 5;

        change = change % 5;

        int Twos = change / 2;
        change = change % 2;

        int Ores = change;
        change = change % 1;

        System.out.print("Thousands    " + Thousands + "\nFiveHundreds " + FiveHundreds + "\nTwoHundreds  " +
                TwoHundreds + "\nHundreds     " + Hundreds + "\nFifties      " + Fiftys + "\nTwenties     " + Twenties + "\nTens         " + Tens +
                "\nFives        " + Fives + "\nTwos         " + Twos + "\nOres         " + Ores + "\n");
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        VendingMachineImplements itemint = new VendingMachineImplements();
        Product[] arrInt = itemint.findAll();
        for (int i = 0; i < arrInt.length; i++)
            if (productNumber == arrInt[i].getProductId()) {
                System.out.print(
                        "The item no. you selected is                   " + arrInt[i].getProductId() +
                                "\n item Name is                    " + arrInt[i].getProductName()+
                                "\nItem description                               "+arrInt[i].getCalories()+"\n");
            }
        return this.toString();
    }

    @Override
    public int getBalance() {
        System.out.println("Current pool balance is " + pool);
        return pool;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
