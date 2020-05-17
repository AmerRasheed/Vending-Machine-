package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SweetTest {
    private Sweet testObjectSweet;

    @Before
    public void setUp() throws Exception {
        testObjectSweet = new Sweet(1, "Choclate", 18, 200);


    }

    @Test
    public void test_to_check_whether_Sweet_class_fields_are_correct() {
                   Assert.assertEquals(1, testObjectSweet.getProductId());
            Assert.assertEquals("Choclate", testObjectSweet.getProductName());
            Assert.assertEquals(18, testObjectSweet.getPrize());
            Assert.assertEquals(200, testObjectSweet.getCalories());
        }
    }
