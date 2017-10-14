package com.javarush.test;

/**
 * Created by Student on 13.05.2017.
 */
public class Bashtalat {
    public static void main(String[] args) {
        Human humanl = new Human("Edil", 26,"Tagaibekov");
        Human human2 = new Human("Student", 24, "Tagaibek uulu");


        if (human2.getAge()>humanl.getAge())
            human2.printHuman();
        else
            humanl.printHuman();


        if (human2.getAge()<humanl.getAge())
            System.out.println(human2.getAge());
        else
            System.out.println(humanl.getAge());

        Human copyhuman =  new Human(human2);
        copyhuman.printHuman();


    }
}
