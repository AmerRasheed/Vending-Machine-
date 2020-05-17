package org.example;

public abstract class Product {
    public static int counter=0;
    private int productId;
    private String productName;
    private int prize;
    private int calories;

    // Constructor

    public Product(int productId, String productName, int prize,int calories) {
        this.productId = ++counter;
        setProductName(productName);
        setPrize(prize);
        this.calories=calories;
    }

    public int getProductId() {

        return productId;
    }

//Getters Setters

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", prize=" + prize ;
    }

   public abstract String use();
   public abstract String examine();

}
