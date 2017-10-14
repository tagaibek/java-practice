package com.javarush.test.animal;

/**
 * Created by Student on 13.05.2017.
 */
public class Dog {
    //object properties  |  поля обьекта или параметры обьекта
    private String name;
    private int tail;

    //constructor
    public Dog(String name, int tail){
        this.name = name;
        this.tail = tail;
    }
    //this method returns integer | этот метод возврошяет цифру
    //object method | относится к обьекту
    public  int getTail(){
        return this.tail;
    }

    //this method accepts parameter integer | этот метод принимает тип целое число как параметр, потом этот параметр присваивает к this.tail
    //object method | относится к обьекту
    public void setTail(Integer incomingTail){
      this.tail  = incomingTail;
    }

    //class level properties | параметры на уровне класса
    private static int numberOfLegs = 4;

    // this static method (class level) returns integer | этот статичный метод возврощает целое число
    // class level method | метод на уровне класса
    // this method can be called from static methods
    public static int getNumberOfLegs(){
        return Dog.numberOfLegs;
    }

    // this static method ( class levele)accepts parameter integer | этот статичный метод принимает целое число как параметр
    // class level method | метод на уровне класса
    // this method can be called from static methods
    public static void setNumberOfLegs(int numberOfLegs){
        Dog.numberOfLegs = numberOfLegs;
    }
}
