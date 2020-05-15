package org.example;

import java.util.Scanner;

    public enum Denominations {
        kr1(1),
        kr3(3),
        kr5(5),
        kr10(10),
        kr20(20),
        kr50(50),
        kr100(100),
        kr200(200),
        kr500(500),
        kr1000(1000);

        private int denValue;

        Denominations(int denValue){
            this.denValue=denValue;
        }

        public int getDenInput(){
            Scanner sc= new Scanner(System.in);
            System.out.println("Put money to get product ");
            int denInput = sc.nextInt();
            return denInput;
        }

    }
