package codeabbey;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] result = new int[test];
        for (int i = 0; i < test; i++) {
            String string = sc.nextLine();
            while (string.isEmpty()) {
                string = sc.nextLine();
            }
            char[] chars = string.toCharArray();
            result[i] = isBracket(chars);
        }
        System.out.println(Arrays.toString(result));
    }

    private static int isBracket(char[] chars){
        String value = "";
        for (char i : chars) {
            if (i == 40 || i == 41 || i == 60 || i == 62
                    || i == 91 ||  i == 93 || i == 123 || i == 125 ){
                value += i;
            }
        }
        char[] seq = value.toCharArray();
        int result = isBracket2(seq);
        return result;
    }



    private static int isBracket2(char[] chars) {
        Stack<Character> stack = new Stack<>();
        if (chars.length % 2 !=0){
            return 0;
        }
        for (char c: chars) {
            if (c == '(' || c == '[' || c == '{' || c == '<'){
                stack.push(c);
            }else {
                if (stack.isEmpty()) {
                    return 0;
                }

                char top = stack.pop();
                if (!((c == ')' && top == '(')  || (c == ']' && top == '[') ||
                        (c == '}' && top == '{') || (c == '>' && top == '<'))) {
                    return 0;
                }
            }
        }
    return 1;
    }
}

