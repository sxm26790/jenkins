package com.geekcap.vmturbo;

import org.junit.Assert;
import org.junit.Test;

public class ThingTest {

    @Test
   public void testN() {
        Thing t = new Thing();
        t.setN(5);
        Assert.assertEquals("N should be 5", 5, t.getN());
    }
} 
