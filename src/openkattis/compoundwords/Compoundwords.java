package openkattis.compoundwords;

import java.util.*;

public class Compoundwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        while (true) {
            String string = sc.nextLine(); // a bb
            if (string.isEmpty()) {
                break;
            }

            List<String> lineInput = Arrays.asList(string.split(" "));
            input.addAll(lineInput);
        }
        List<String> result = getWords(input);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static List<String> getWords(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String w: words) {
            for (String w2:words) {
                if(!w.equals(w2)) {
                    result.add(w + w2);
                }
            }
        }
        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            String str = result.get(i);
            for (int j = i+1; j < result.size(); j++) {
                String s = result.get(j);
                if (Objects.equals(str, s) && i != j) {
                    result.remove(j);
                }
            }
        }
        return result;
    }
}
