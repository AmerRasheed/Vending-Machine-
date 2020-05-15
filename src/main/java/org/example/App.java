package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Vending Machine");

        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        //Defining Product information
        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

        Product fruit= new Product(1,"Banana",8);

        //int fruit1=fruit.getPrize();
        //System.out.println(fruit1);

         Product drink= new Product(2,"Pepsi",5);
         Product food= new Product(3,"Egg Sandiwitch",65);
         Product sweet= new Product(4,"Kit Kat",8);

        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
       //Defining Denominations stuff
        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

        Denominations den1 = Denominations.kr5;
        Denominations den2 = Denominations.kr10;
        Denominations den3 = Denominations.kr5;
        // den1.getDenInput();
        //  System.out.println(den1);

        Denominations[] depositDenoms = {Denominations.kr1, Denominations.kr3, Denominations.kr5,
                Denominations.kr10, Denominations.kr20, Denominations.kr50,
                Denominations.kr100, Denominations.kr200, Denominations.kr500, Denominations.kr1000};

        System.out.println("The total held deposit is " + getDenInput(depositDenoms) + " krs");
    }

    public static int getDenInput(Denominations... denominations) {
        int sum = 0;
        for (Denominations den : denominations) {
            sum = sum + den.getDenInput();

        }
        return sum;
    }
}

