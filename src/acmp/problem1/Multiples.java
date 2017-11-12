package acmp.problem1;

import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListThree = new ArrayList<>();
        ArrayList<Integer> arrayListFive = new ArrayList<>();
        int three = 3;
        int five = 5;
        int hun = 1000;
        for (int i = 5; i<hun; i++){
            if (i%five==0){
                arrayListFive.add(i);
            }
        }
        for (int i = 3; i<hun;i++){
            if (i%three==0){
                arrayListThree.add(i);
            }
        }
        int sumThree = 0;
        for (int i : arrayListThree){
            sumThree +=i;
        }
        int sumFive = 0;
        for (int i:arrayListFive){
            sumFive += i;
        }
        System.out.println("Three " + sumThree);
        System.out.println("Five " + sumFive);
    }

}
