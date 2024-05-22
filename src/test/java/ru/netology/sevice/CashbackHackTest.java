package ru.netology.sevice;

import ru.netology.service.CashbackHackService;

public class CashbackHackTest {
    org.junit.Test;

    public void CashbackHackService () {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(expected,actual);
    }
}
