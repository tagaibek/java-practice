package openkattis.zoo;

import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberList = 0;
        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            Map<String, Integer> orderedList = getCount(n, sc);
            if (n == 0) {
                break;
            }
            numberList++;
            print(numberList, orderedList);
        }
    }
    private static void print(int numberList ,Map<String, Integer> map) {
        System.out.println();
        System.out.println("List " + numberList );
        for (Map.Entry<String, Integer> map1 : map.entrySet()) {
            String strResult = map1.getKey();
            Integer integer = map1.getValue();
            System.out.println(strResult + " | " + integer);
        }
    }

    private static Map<String,Integer> getCount(int n, Scanner sc) {
        List<String[]> listZoo = new ArrayList<>();
        for (int i = 0; i < n ; i++){
            String animal = sc.nextLine();
            String[] list = animal.split(" ");
            listZoo.add(list);
        }

        Map<String , Integer> map = new TreeMap<>();
        for (int i =0; i < listZoo.size(); i++){
            String[] s =  listZoo.get(i);
            String index = s[s.length-1].toLowerCase();
            int count = 0;
            for (int j = 0; j <listZoo.size() ; j++) {
                String[] s1 =  listZoo.get(j);
                String index1 = s1[s1.length-1].toLowerCase();
                if (index.equals(index1) ){
                    count++;
                }
            }
            map.put(index,count);
        }return map;
    }
}
