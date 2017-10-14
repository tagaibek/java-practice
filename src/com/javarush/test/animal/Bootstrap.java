package com.javarush.test.animal;

public class Bootstrap {

    //constructor
    public Bootstrap(){
    }

    public static void main(String[] args) {
        //working with object level methods | работа с методами обьекта
        Dog tuzik = new Dog("Tuzik", 10);

        //calling method of the object  | вызываем метод обьекта
        int blablaTail = tuzik.getTail();
        System.out.println(blablaTail);

        //calling method with parameter | вызываем метод с параметром.
        tuzik.setTail(11);
        System.out.println(tuzik.getTail());

        //working with class level methods | работа с методами класса
        System.out.println(Dog.getNumberOfLegs());
        Dog.setNumberOfLegs(3);
        System.out.println(Dog.getNumberOfLegs());

        printDogLegs();

        Bootstrap boot = new Bootstrap();
        boot.printTuzikTail(tuzik);
    }

    //static method
    public static void printDogLegs(){
        System.out.println();
        System.out.println(Dog.getNumberOfLegs());
    }

    //non-static method
    public void printTuzikTail(Dog sobaka){
        System.out.println(sobaka.getTail());
    }
}
