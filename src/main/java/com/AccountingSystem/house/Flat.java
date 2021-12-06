package com.AccountingSystem.house;

import com.AccountingSystem.house.facilities.flatFacilities.*;

import java.util.TreeMap;

public class Flat {
    private int countOfHumans;
    private int countOfRooms;
    private double square;
    private double price;
    private SwimmingPool swimmingPool;
    private Terrace terrace;
    private int numberOfFlat;

    Flat() {
        countOfHumans = 0;
        countOfRooms = 0;
        square = 0;
        price = 0;
        numberOfFlat = 0;
        swimmingPool = null;
        terrace = null;
    }
    public Flat(int newCountOfHumans, int newCountOfRooms, double newSquare, double newPrice, int newNumberOfFlat, SwimmingPool swimmingPool, Terrace terrace) {
        countOfHumans = newCountOfHumans;
        countOfRooms = newCountOfRooms;
        square = newSquare;
        price = newPrice;
        numberOfFlat = newNumberOfFlat;
        this.swimmingPool = swimmingPool;
        this.terrace = terrace;
    }

    public int getCountOfHumans() {
        return countOfHumans;
    }
    public int getCountOfRooms() {
        return countOfRooms;
    }
    public double getSquare() {
        return square;
    }
    public double getPrice() {
        return price;
    }
    public int getNumberOfFlat() {
        return numberOfFlat;
    }
    public void setCountOfHumans(int newCountOfHumans) {
        countOfHumans = newCountOfHumans;
    }
    public void setCountOfRooms(int newCountOfRooms) {
        countOfRooms = newCountOfRooms;
    }
    public void setSquare(double newSquare) {
        square = newSquare;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }

}
