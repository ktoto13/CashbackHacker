package ru.netology.service;

import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test

    public void notOfferBuyMoreZeroIf1000() {

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void offerBuyMore1If999() {

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void offerBuyMore999If1() {


        int expected = 999;
        int actual = service.remain(1);
        assertEquals(expected, actual);
    }
}




