package org.example;

import org.example.model.VendingMachine;
import org.example.model.VendingMachineImplements;

import java.util.Scanner;

/**
 * Vending Machine by Amer Rasheed.
 */

public class App {

    public static char permitOperationContinue() {
        char s3 = ' ';
        char Op = ScannerCallingClass.scannerCharacter(s3);
        return Op;
    }

    public static void invokemenu() {
        System.out.println("You have following options (in Vending Machine              ");
        System.out.println("Add Money to the pool (for puchasing product   (a) Add Money ");
        System.out.println("Buy Product                                    (b) Buy Product ");
        System.out.println("End session and get remainder amount back      (e) End Session");
        System.out.println("View all product desctiption                   (d) Item Description");
        System.out.println("Check your balance amount (in pool)            (c) Check Balance Money");
        System.out.println("View all products                              (f) Full Menu");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("********************Wellcome to Vending Machine******************************************");

        VendingMachineImplements actual = new VendingMachineImplements();
        Product f1 = actual.addfruitProduct("              PineApple piece      ", 15,100);


        Product p1 = actual.addfruitProduct("              Banana               ", 8,150);

        Product p2 = actual.addfruitProduct("              Orange               ", 10,80);
        Product p3 = actual.addfruitProduct("              Apricot              ", 12,90);
        Product p4 = actual.addfruitProduct("              Grapes Punch         ", 25,80);
        Product d1 = actual.adddrinkProduct("              Cold Coffee          ", 35,210,250);

        Product p5 = actual.adddrinkProduct("              Coke                 ", 25,530,500);

        Product p6 = actual.adddrinkProduct("              Fanta                ", 30, 500,500);
        Product p7 = actual.adddrinkProduct("              Sprite               ", 30,500,500);
        Product p8 = actual.adddrinkProduct("             Dew                  ", 30,500,500);;


        Product s0 = actual.addsweetProduct("             Choclate Milk        ", 35,250);

        Product p9 = actual.addsweetProduct("             Kit Kat              ", 18,200);

        Product p10 = actual.addsweetProduct("             Snicker              ", 18,220);
        Product p11 = actual.addsweetProduct("             Kanel Bulla          ", 45,250);
        Product p12 = actual.addsweetProduct("             Gachak               ", 30, 200);

       // f1.use();
        //d1.use();
        //s0.use();
        Product[] arr = actual.findAll();

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Do you want to enter operation (Press y ) or you want to exit the program .....(Press n)  (y/n)");
            char flag = sc.next().charAt(0);
            if (flag == 'y') {
                System.out.println();
                System.out.println("Enter your choice");
                invokemenu();
                char permit = sc.next().charAt(0);

                switch (permit) {
                    //void addCurrency (int amount)
                    case 'a': {

                        System.out.println("Put money to get product ");
                        int denInput = sc.nextInt();
                        actual.addCurrency(denInput);
                    }
                    break;
                    //Product request (int productNumber)
                    case 'b': {
                        System.out.println("Enter the (Item No. from menu) product you want to choose");
                        System.out.println("\n");
                        System.out.println("We are offering following products TODAY     ");
                        System.out.println("\n");
                        System.out.println("Item No.     Product Name         Item Prize ");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i].getProductId());
                            System.out.print(arr[i].getProductName());
                            System.out.println(arr[i].getPrize());
                        }
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("\n");
                        System.out.println("Choose the Item no.");
                        int itemno = sc.nextInt();
                        Product alAo = actual.request(itemno);
                        System.out.println("Get your selected item");

                    }
                    break;
                    //int endSession ()
                    case 'e':
                        actual.endSession();
                        System.out.println("Take your change back");
                        break;

                    case 'd':
                        //String getDescription (int productNumber)
                        Scanner sc1 = new Scanner(System.in);

                        System.out.println("We are offering "+arr.length+" items today");
                        System.out.println("Enter the Item no. for which you want description");
                        int itemno1 = sc.nextInt();

                        actual.getDescription(itemno1);

                        //String receive = actual.getDescription(itemno1);
                        //System.out.println(receive);
                        break;
                    case 'c':
                        //int getBalance ()
                        actual.getBalance();
                        break;
                    case 'f':
                        //String [] getProducts ()
                        actual.callmenu();
                        //System.out.println("We are offering following products TODAY     ");
                        System.out.println("Item No.     Product Name         Item Prize ");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i].getProductId());
                            System.out.print(arr[i].getProductName());
                            System.out.println(arr[i].getPrize());
                        }
                        break;
                }
            }// if condition
            else running = false;
        }// while
    }
}

