package com.company1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.company1.Main.lol;
import static org.junit.jupiter.api.Assertions.*;

class silniaTest {

    @Test
    void testsilnianko() {
        silnia sil = new silnia();
        Assert.assertEquals("3!==6", 6,sil.silnianko(3));
    }

    @Test
    void aletest()
    {
        Assert.assertEquals("3==3",3,lol());
    }
}