package codeabbeay.count.names;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CardGame {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = AdylUtils.readInt();
        int[] cardNumber = new int[length];
        for (int i = 0; i < length ; i++) {
            cardNumber[i] = sc.nextInt();
        }
        Map<String,String> result =getRankSuit(cardNumber);
        for (Map.Entry entry: result.entrySet()){
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            System.out.print(k + " - of - " + v + "  ");
        }
        System.out.println(" ");
    }

    private static Map<String,String> getRankSuit(int[] cardNumber) {
        Map<String,String> map = new HashMap<>();
        String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < cardNumber.length; i++) {
            map.put(rank[cardNumber[i] % 13], suit[cardNumber[i] / 13]);
        }
        return map;
    }


}
