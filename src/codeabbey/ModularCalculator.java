package codeabbey;

import acmp.utils.AdylUtils;

import java.io.IOException;
import java.util.Scanner;

public class ModularCalculator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = AdylUtils.readInt();
        int del = 0;
        while (del == 0){
            String s = sc.next();
            int n = sc.nextInt();
            if ("%".equals(s)){
                del = n;
            } else if ("*".equals(s)){
                num = num * n;
            }
            else num = num + n;
        }
        System.out.println(num % del);

    }


}

