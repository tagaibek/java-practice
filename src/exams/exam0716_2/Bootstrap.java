package exams.exam0716_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Human on 16.07.2017.
 */
public class Bootstrap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String positive =reader.readLine();
        String[] s =  positive.split(" ");
        int[] arsNum = new int[s.length];
        for (int i = 0; i<s.length;i++){
            arsNum[i] = Integer.parseInt(s[i]);
        }
        findSecondLargest(arsNum);
        System.out.println("enter number x2: ");
        int x2=Integer.parseInt(reader.readLine());

        int max2 = findSecondLargest(arsNum);
        if (x2==2){
            System.out.println(max2);
        }
        else
            System.out.println("ошибка !!!");
        System.out.println("enter number x1:");
        int x1=Integer.parseInt(reader.readLine());
        int max1=findFirstLargest(arsNum);
        if (x1==1){
            System.out.println(max1);
        }
        else
            System.out.println("ошибка !!!");

        System.out.println("enter number x3: ");
        int x3=Integer.parseInt(reader.readLine());
        if (x3==-1){
            System.out.println("...");
        }
        else
            System.out.println("ошибка !!!");
    }
    private static int findFirstLargest(int[] numbers) throws IOException{
        int maxNumber = 0;
        for (int j = 0;j<numbers.length;j++){
            if (numbers[j]>maxNumber) {
                maxNumber = numbers[j];
            }
        }
        return maxNumber;
    }


    private static int findSecondLargest(int[] numbers) throws IOException {


        int maxNumber = 0;
        int maxNumber2 = 0;
        if (numbers.length==0 || numbers.length<=1){
            return -1;
        }

        for (int i = 0; i<numbers.length; i++){

            if (numbers[i]>maxNumber) {
                maxNumber = numbers[i];
            }
        }
        for (int j = 0;j<numbers.length;j++){
            if (numbers[j]>maxNumber2 && numbers[j]<maxNumber){
                maxNumber2=numbers[j];
            }
        }


        return maxNumber2;
    }

}
