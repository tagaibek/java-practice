package com.javarush.test.car;

/**
 * Created by Student on 13.05.2017.
 */
public class SuperCar {
    private String model;
    private int year;
    private int speed;


    public SuperCar(String model,int year,int speed){
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public SuperCar (SuperCar superCar2){
        this.speed = superCar2.speed;
        this.model = superCar2.model;
        this.year = superCar2.year;
    }


    public int getYear(){
        return this.year;
    }


    public int getSpeed(){
        return this.speed;
    }

    public String getModel(){
        return this.model;
    }

    public void  setSpeed(int speed){
        this.speed = speed;

    }
    public void setYear(int year){
        this.year = year;
    }

}
