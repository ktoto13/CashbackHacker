package ru.netology.service;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test

    public void notOfferBuyMoreZeroIf1000() {

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void offerBuyMore1If999() {

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void offerBuyMore999If1() {


        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }
}




