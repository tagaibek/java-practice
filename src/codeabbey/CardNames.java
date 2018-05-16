package codeabbey;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.Scanner;

public class CardNames {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = AdylUtils.readInt();
        int[] cardNumber = new int[length];
        for (int i = 0; i < length ; i++) {
            cardNumber[i] = sc.nextInt();
        }
        SimpleEntry<String[], String[]> result = getRankSuit(cardNumber);

        String[] arraySuit = result.getValue();
        String[] arrayRank = result.getKey();
        for (int i = 0; i < arrayRank.length; i++){
            String k = arrayRank[i]; //try not to cast, that's what generics are for
            String v = arraySuit[i]; //try not to cast, that's what generics are for
            System.out.print(v + " - of - " + k + "  ");
        }
        System.out.println(" ");
    }

    private static SimpleEntry<String[],String[]> getRankSuit(int[] cardNumber) {
        String[] arraySuit = new String[cardNumber.length];
        String[] arrayRank = new String[cardNumber.length];
        String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack", "Queen", "King", "Ace"};

        for (int i = 0; i < cardNumber.length; i++) {
            arrayRank[i] =  rank[cardNumber[i] % 13];
            arraySuit[i] = suit[cardNumber[i] / 13];
        }

        return new SimpleEntry<>(arraySuit, arrayRank) ;
    }
}
