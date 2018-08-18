package hackerrank;

import java.util.Scanner;

public class InsertionSort2 {
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
        for(int i=1;i<ar.length;i++){
            insertIntoSortedArray(ar, i);
        }

    }

    private static void insertIntoSortedArray(int[] ar, int i) {
        int n= ar[i];
        i--;
        while(i>=0 && ar[i]>n){
            ar[i+1]=ar[i];
            i--;

        }
        ar[i+1]= n;
        printArray(ar);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
