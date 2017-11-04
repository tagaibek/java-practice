package acmp.task62;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cell {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(getKey(s));
    }

    private static String getKey(String s) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A1","BLACK");hashMap.put("A2","WHITE");hashMap.put("A3","BLACK");hashMap.put("A4","WHITE");
        hashMap.put("A5","BLACK");hashMap.put("A6","WHITE");hashMap.put("A7","BLACK");hashMap.put("A8","WHITE");
        hashMap.put("B1","WHITE");hashMap.put("B2","BLACK");hashMap.put("B3","WHITE");hashMap.put("B4","WHITE");
        hashMap.put("B5","WHITE");hashMap.put("B6","BLACK");hashMap.put("B7","WHITE");hashMap.put("B8","WHITE");
        hashMap.put("C1","BLACK");hashMap.put("C2","WHITE");hashMap.put("C3","BLACK");hashMap.put("C4","WHITE");
        hashMap.put("C5","BLACK");hashMap.put("C6","WHITE");hashMap.put("C7","BLACK");hashMap.put("C8","WHITE");
        hashMap.put("D1","WHITE");hashMap.put("D2","BLACK");hashMap.put("D3","WHITE");hashMap.put("D4","WHITE");
        hashMap.put("D5","WHITE");hashMap.put("D6","BLACK");hashMap.put("D7","WHITE");hashMap.put("D8","WHITE");
        hashMap.put("E1","BLACK");hashMap.put("E2","WHITE");hashMap.put("E3","BLACK");hashMap.put("E4","WHITE");
        hashMap.put("E5","BLACK");hashMap.put("E6","WHITE");hashMap.put("E7","BLACK");hashMap.put("E8","WHITE");
        hashMap.put("F1","WHITE");hashMap.put("F2","BLACK");hashMap.put("F3","WHITE");hashMap.put("F4","WHITE");
        hashMap.put("F5","WHITE");hashMap.put("F6","BLACK");hashMap.put("F7","WHITE");hashMap.put("F8","WHITE");
        hashMap.put("G1","BLACK");hashMap.put("G2","WHITE");hashMap.put("G3","BLACK");hashMap.put("G4","WHITE");
        hashMap.put("G5","BLACK");hashMap.put("G6","WHITE");hashMap.put("G7","BLACK");hashMap.put("G8","WHITE");
        hashMap.put("H1","WHITE");hashMap.put("H2","BLACK");hashMap.put("H3","WHITE");hashMap.put("H4","WHITE");
        hashMap.put("H5","WHITE");hashMap.put("H6","BLACK");hashMap.put("H7","WHITE");hashMap.put("H8","WHITE");

        for (Map.Entry entry: hashMap.entrySet()) {
            String s1;
            String key = (String) entry.getKey();
           String value = (String) entry.getValue();
            if (Objects.equals(s, key)){
                s=String.valueOf(value);
            }
        }
        return s;
    }
}

