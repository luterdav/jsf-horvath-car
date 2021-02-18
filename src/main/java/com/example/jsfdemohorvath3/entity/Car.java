package com.example.jsfdemohorvath3.entity;

public class Car {

    private String brand;
    private String model;
    private int doors;
    private String engineType;
    private String colour;
    private long id;
    private String engineCode;
    private int horsepower;
    private int topSpeed;

    public Car() {

    }

    public Car(String engineCode, int horsepower, int topSpeed, long id, String brand, String model, int doors, String
            engineType, String colour) {
        this.brand = brand;
        this.model = model;
        this.doors = doors;
        this.engineType = engineType;
        this.colour = colour;
        this.id = id;
        this.engineCode = engineCode;
        this.horsepower = horsepower;
        this.topSpeed = topSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
