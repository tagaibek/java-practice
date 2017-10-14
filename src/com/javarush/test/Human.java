package com.javarush.test;

/**
 * Created by Student on 13.05.2017.
 */
public class Human {
    private String name ;
    private int age;
    private String lastname;


    public Human(String name,int age){
        this.name = name;
        this.age = age;

    }

    public Human(String name,Integer age,String lastname){
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }

    public Human(Human human3){
        this.name = human3.getName();
        this.age = human3.getAge();
        this.lastname = human3.getLastname();
    }



    public String getLastname(){
        return this.lastname;
    }


    public String getName(){
        return this.name;

    }
    public int getAge(){
        return this.age;
    }
    public void  printHuman() {
        System.out.println(this.name);
        System.out.println(this.lastname);
    }

}
