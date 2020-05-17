package org.example;

import java.util.Arrays;

public class Items {

    private static Product[] items = new Product[0];

    public int size() {

        return items.length;
    }

    public Product[] findAll() {
        return items;
    }



    public Product addfruitProduct(String ProductName, int itemPrize) {
        Product item = new Fruit(1,ProductName,itemPrize,200);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }
    public Product adddrinkProduct(String ProductName, int itemPrize) {
        Product item = new Fruit(1,ProductName,itemPrize,200);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }
    public Product addsweetProduct(String ProductName, int itemPrize) {
        Product item = new Fruit(1,ProductName,itemPrize,200);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
        return item;
    }
}
