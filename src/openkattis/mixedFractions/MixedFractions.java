package openkattis.mixedFractions;

import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        if (denominator == 0 && numerator == 0){
            System.out.println();
        }
        else System.out.println((numerator / denominator) + " " +(numerator % denominator) + " / " + denominator);

    }
}
