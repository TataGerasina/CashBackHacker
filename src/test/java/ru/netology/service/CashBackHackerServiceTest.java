package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerServiceTest {

    @Test
    void remain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }
    @Test
    void shouldRemainWhenAmount1000() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }
    @Test
    void shouldRemainWhenAmount1500() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual,expected);
    }

    @Test
    void shouldRemainWhenAmount1900() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }
}