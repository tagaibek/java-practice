package hackerrank;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Closest {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        int[] result ;
        List<Integer> list = new ArrayList<>();
        int differens = 1000000;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length -1 ; i++) {
            int dif = arr[i + 1] -arr[i];
            if (dif < differens){
                if (list.size()  == 0){
                    list.add(arr[i]);
                    list.add(arr[i +1]);
                    differens = dif;
                }
                else{
                    list.set(0,arr[i]);
                    list.set(1,arr[i+1]);
                    differens = dif;
                }

            }
            else if (dif == differens){
                list.add(arr[i]);
                list.add(arr[i+1]);
            }
        }
        result = new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}

