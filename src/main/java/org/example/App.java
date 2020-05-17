package org.example;

import org.example.model.VendingMachine;
import org.example.model.VendingMachineImplements;

import java.util.Scanner;

/**
 * Hello world!
 */

public class App {

    public static char permitOperationContinue() {
        char s3 = ' ';
        char Op = ScannerCallingClass.scannerCharacter(s3);
        return Op;
    }

    public static void main(String[] args) {
        System.out.println("Vending Machine");

        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        //Defining Product information
        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        /*
        Product[] productArray = new Product[5];

      //  for(Product cheezain: Product[])
        //    System.out.println(cheezain);


        Product fruit = new Product(1, "Banana", 8);

        //int fruit1=fruit.getPrize();
        //System.out.println(fruit1);

        Product drink = new Product(2, "Pepsi", 5);
        Product food = new Product(3, "Egg Sandiwitch", 65);
        Product sweet = new Product(4, "Kit Kat", 8);

        Fruit Banana = new Fruit(5,"Pineapple",45,200);

              System.out.println(drink.getProductName());
Product p= new Product(6,"Khajoor",40);
*/
        Items item1 = new Items();
        Product f1 = item1.addfruitProduct("              PineApple piece      ", 15);

        Product p1 = item1.addfruitProduct("              Banana               ", 8);
        System.out.println(p1.getProductName());
        System.out.println(p1.getProductId());
        System.out.println(p1.getPrize());
        Product p2 = item1.addfruitProduct("              Orange               ", 10);
        Product p3 = item1.addfruitProduct("              Apricot              ", 12);
        Product p4 = item1.addfruitProduct("              Grapes Punch         ", 25);

        Product d1 = item1.adddrinkProduct("              Cold Coffee          ", 35);

        Product p5= item1.adddrinkProduct("              Coke                 ",18);
        System.out.println(d1.getProductName());
        System.out.println(d1.getProductId());
        System.out.println(d1.getPrize());
        Product p6= item1.adddrinkProduct("              Fanta                ",18);
        Product p7= item1.adddrinkProduct("              Sprite               ",18);
        Product p8=  item1.adddrinkProduct("             Dew                  ",18);

        Product s0 = item1.adddrinkProduct("             Choclate Milk        ", 35);

        Product p9= item1.addsweetProduct("             Kit Kat              ",18);
        System.out.println(p9.getProductName());
        System.out.println(p9.getProductId());
        System.out.println(p9.getPrize());
        Product p10= item1.addsweetProduct("             Snicker              ",18);
        Product p11= item1.addsweetProduct("             Kanel Bulla          ",45);
        Product p12=  item1.addsweetProduct("             Gachak               ",30);
f1.use();
d1.use();
s0.use();
        Product[] arr = item1.findAll();

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i].getProductId());
            System.out.print(arr[i].getProductName());
            System.out.println(arr[i].getPrize());
        }

        System.out.println("size is " + item1.size());

//for (int i=0;i<productArray.length;i++)
        //  System.out.println(productArray[i].toString());

        System.out.println("");

     /*   product food product
        Fruit    fruit1 fruit
        product Fanta drink
        drink chocklatedrink drink
       */
        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        //Defining Denominations stuff
        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&


        VendingMachine actual = new VendingMachineImplements();
//of type DRINK FOOD SWEET
        //actual.addProduct   (new Food(1,kit, 67))
//actual.addProduct   (new drink (1,kit, 67))
        //actual.addProduct   (new Food(1,kit, 67))

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Do you want to enter operation (Press y ) or you want to exit the program .....(Press n)  (y/n)");

            char flag = sc.next().charAt(0);
            if (flag == 'y') {

                System.out.println("Enter your choice");
               // menu();
                char permit = sc.next().charAt(0);

                switch (permit) {
                    case 'a': {

                        System.out.println("Put money to get product ");
                        int denInput = sc.nextInt();
                        actual.addCurrency(denInput);
                    }
                    break;
                    case 'b': {
                        System.out.println("Enter the (Item No. from menu) product you want to choose");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i].getProductId());
                            System.out.print(arr[i].getProductName());
                            System.out.println(arr[i].getPrize());
                        }
                        Scanner sc1 = new Scanner(System.in);
                        int itemno = sc.nextInt();
                        Product alAo = actual.request(itemno);
                        System.out.println("Get your selected item");

                    }
                    break;
                    case 'c':
                        actual.endSession();
                        System.out.println("Take your change back");
                        break;

                    case 'd':
                        Scanner sc1 = new Scanner(System.in);
                        int itemno1 = sc.nextInt();
                        String receive = actual.getDescription(itemno1);
                        System.out.println(receive);
                        break;
                    case 'e':
                        actual.getBalance();
                        break;
                    case 'f':
                        actual.callmenu();
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

 /*       Denominations den1 = Denominations.kr5;
        Denominations den2 = Denominations.kr10;
        Denominations den3 = Denominations.kr5;

        //System.out.println(den1);

        Denominations[] depositDenoms = {Denominations.kr1, Denominations.kr3, Denominations.kr5,
                Denominations.kr10, Denominations.kr20, Denominations.kr50,
                Denominations.kr100, Denominations.kr200, Denominations.kr500, Denominations.kr1000};

        System.out.println("The total held deposit is " + getDenInput(depositDenoms) + " krs");

    }
*/
     /*   public static void menu () {
            System.out.println("You have following options                        ");
            System.out.println("Add Money to the pool (for puchasing product   (a)");
            System.out.println("Buy Product                                    (b)");
            System.out.println("End session and get remainder amount back      (c)");
            System.out.println("View all product desctiption                   (d)");
            System.out.println("Check your balance amount (in pool)            (e)");
            System.out.println("View all products                              (f)");
        }
*/
   /* public static int getDenInput(Denominations... denominations) {
        int sum = 0;
        for (Denominations den : denominations) {
            sum = sum + den.getDenInput();
        }
        return sum;
    }*/
    }
}

//accessing actual inside getDenInput
//in vm interface -> addCurrency method sum initiallize issue