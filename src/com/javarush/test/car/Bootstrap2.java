package com.javarush.test.car;

/**
 * Created by Student on 13.05.2017.
 */
public class Bootstrap2 {
    public static void main(String[] args) {
        SuperCar superCar7 = new SuperCar("tico",1996,120);
        SuperCar superCar8 = new SuperCar("fit", 2004,180);
        SuperCar superCar9 = new SuperCar(superCar7);

        superCar9.setYear(2017);
        superCar9.setSpeed(220);

        System.out.println(superCar7.getSpeed());
        System.out.println(superCar8.getSpeed());
        System.out.println(superCar9.getSpeed());



        if (superCar9.getSpeed()>superCar7.getSpeed()&& superCar9.getSpeed()>superCar8.getSpeed()){
            System.out.print(superCar9.getModel()+" "+superCar9.getYear());
        }

        if (superCar7.getSpeed()>superCar9.getSpeed()&& superCar7.getSpeed()>superCar8.getSpeed()){
            System.out.print(superCar7.getModel()+" "+superCar7.getYear());
        }
        if (superCar8.getSpeed()>superCar9.getSpeed()&& superCar8.getSpeed()>superCar7.getSpeed()){
            System.out.print(superCar8.getModel()+" "+superCar8.getYear());
        }



    }
}
