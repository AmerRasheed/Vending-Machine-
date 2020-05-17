package org.example.modelTest;

import org.example.Fruit;
import org.example.Product;
import org.example.model.VendingMachineImplements;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineImplementsTest {

private Product[] testarrayVarVMimplements;
@Test
    public void test_to_check_FinalALL_method() {
    Product[] testarray = new Product[0];
       testarrayVarVMimplements = new VendingMachineImplements().findAll();
        Assert.assertArrayEquals(testarray,testarrayVarVMimplements);
    }

   private Product testVMimplements;
    @Test
    public void test_to_check_addFruit_Product_items() {

        testVMimplements = new VendingMachineImplements().addfruitProduct("FruitName",30,300);
Assert.assertEquals("FruitName",testVMimplements.getProductName());
Assert.assertEquals(30,testVMimplements.getPrize());
Assert.assertEquals(300,testVMimplements.getCalories());
    }
    @Test
    public void test_to_check_adddrink_Product_items() {
        Product expected;

        testVMimplements = new VendingMachineImplements().adddrinkProduct("FruitName",30,300,500);
        Assert.assertEquals("FruitName",testVMimplements.getProductName());
        Assert.assertEquals(30,testVMimplements.getPrize());
        Assert.assertEquals(300,testVMimplements.getCalories());
        //Assert.assertEquals(500,testVMimplements.getSize());
    } @Test
    public void test_to_check_addSweet_Product_items() {
        Product expected;

        testVMimplements = new VendingMachineImplements().addsweetProduct("FruitName",30,300);
        Assert.assertEquals("FruitName",testVMimplements.getProductName());
        Assert.assertEquals(30,testVMimplements.getPrize());
        Assert.assertEquals(300,testVMimplements.getCalories());
    }
  }
