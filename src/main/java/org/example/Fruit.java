package org.example;

public class Fruit extends Product{
    //private int calories;

    public Fruit(int productId, String productName, int prize, int calories) {
        super(productId, productName, prize,calories);
       // this.calories = calories;
    }
/*
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
*/
    @Override
    public String use(){
        System.out.println("Biten");
        return "Consume";
    }

    @Override
    public String examine() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Fruit{" + super.toString()+
               // "calories=" + calories +
                '}';
    }

}
