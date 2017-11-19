package acmp.problem9;


public class Solution {
    public static void main(String[] args) {
        findPythagorianTriples(644);
    }

    private static void findPythagorianTriples(int n) {
        for (int c = 3; c < n; c++) {
            for (int b = 2; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if (a * a + b * b == c * c && a + b + c == n) {
                        System.out.println("a=" + a);
                        System.out.println("b=" + b);
                        System.out.println("c=" + c);
                        return;
                    }
                }
            }
        }
    }
//        for (int i = 0; i <= 999; i++){
//
//            int a2 = a * a;
//            int b2 = b * b;
//            int c2 = a2 + b2;
//            if (a + b + c == 1000){
//
//            }
//        }
}

//System.out.println(a +" + " + b +" + " + c +" = "+ 1000);
