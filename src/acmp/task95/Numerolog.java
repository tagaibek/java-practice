package acmp.task95;

import acmp.utils.AdylUtils;

import java.io.IOException;

public class Numerolog {
    public static void main(String[] args) throws IOException {
        int num = AdylUtils.readInt();
        int num2 = 0;
        if (num > 9) {
            num2 = getSum(num);
        }
        System.out.println(num + " " + num2);

    }

    public static int getSum(int num) {
        char[] numberChars = (num + "").toCharArray();
       // int ints +=n
        return 0;
    }

//
//        int a =0;
//        int k = 0;
//        if (numberArr.length > 0){
//             a = getSum(numberArr);
//        }
//
//        return a;
//    }
//
//    private static int getSum(int[] numberArr) {
//        int sum = 0;
//        for (int i : numberArr){
//            if (sum > 9){
//                sum += i;
//            }
//        }
//        return sum;
//    }


}