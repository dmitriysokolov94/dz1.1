package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testPurchasesFor1000() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPurchasesFor900() {
        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPurchasesFor1100() {
        int actual = service.remain(1100);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }
}
