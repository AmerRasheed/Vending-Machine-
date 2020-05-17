package org.example;

public class Sweet extends Product {


    public Sweet(int productId, String productName, int prize, int calories) {
        super(productId, productName, prize,calories);
       // super.calories = calories;
    }

    //public int getCalories() {        return calories;}


   // public void setCalories(int calories) {        this.calories = calories;}

    @Override
    public String use(){
        System.out.println("Enjoyed");
        return "Consume";
    }

    @Override
    public String examine() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Fruit{" + super.toString()+
                //"calories=" + calories +
                '}';
    }

}
