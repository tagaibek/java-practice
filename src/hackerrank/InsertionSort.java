package hackerrank;


import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        insertionSort(ar);
    }

    private static void insertionSort(int[] ar) {
        boolean changed ;
        for (int i = ar.length - 1; i >= 1; i--) {
            int tmp = ar[i];
            int j = i-1;
            for (changed = false; j>=0; j--){
                if (ar[j] > tmp){
                    changed = true;
                    ar[j+1] = ar[j];
                    printArray(ar);
                }
                else{
                    ar[j + 1] =tmp;
                    if (changed){
                        printArray(ar);
                    }
                }


            }
        }
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
