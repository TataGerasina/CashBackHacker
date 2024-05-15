package ru.netology.service;

class CashBackHackerService {
    private final int boundary = 1000;

    public int remain(int amount) {

        return boundary - amount % boundary;
    }
}