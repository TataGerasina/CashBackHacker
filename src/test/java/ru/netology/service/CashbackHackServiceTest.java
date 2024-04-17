package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);
    }

    @Test
    void shouldRemainWhenAmount1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected,actual);
    }

    @Test
    void shouldRemainWhenAmount1900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);
    }
}