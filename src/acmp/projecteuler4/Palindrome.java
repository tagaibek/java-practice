package acmp.projecteuler4;

public class Palindrome {
    public static void main(String[] args) {
        int maxP = 0;
        int n = 0;
        int g = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int treeNum = j * i;
                int m = getPalindrome(treeNum);
                if (maxP < m ){
                    maxP = m;
                    n=i;
                    g=j;
                }

            }
        }
        System.out.println("The largest palindrome made from the product of two 3-digit numbers " + maxP + " =  " + n + " * " + g);
    }

    private static int getPalindrome(int treeNum) {
        int next = 0;
        int pal2 = treeNum;
        while (pal2 != 0)
        {
            next = (next * 10) + (pal2 % 10);
            pal2 /= 10;
        }

        if (next == treeNum) {
            return  treeNum;
        }
        else return 0;
    }
}
