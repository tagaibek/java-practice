package codeabbeay;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardNames {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] cardNumber = new int[length];
        for (int i = 0; i < length ; i++) {
            cardNumber[i] = sc.nextInt();
        }
        Map<String,String> result =getRankSuit(cardNumber);
        for (Map.Entry entry: result.entrySet()){ //use generics here
            String k = (String) entry.getKey(); //try not to cast, that's what generics are for
            String v = (String) entry.getValue(); //try not to cast, that's what generics are for
            System.out.print(k + " - of - " + v + "  ");
        }
        System.out.println(" ");
    }

    private static Map<String,String> getRankSuit(int[] cardNumber) {
        Map<String,String> map = new HashMap<>();
        String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack", "Queen", "King", "Ace"};

        for (int aCardNumber : cardNumber) {
            map.put(rank[aCardNumber % 13], suit[aCardNumber / 13]);
        }
        return map;
    }
}
