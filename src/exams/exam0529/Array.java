package exams.exam0529;

/**
 * Created by Student on 29.05.2017.
 */
public class Array {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0]="Bob";
        strings[1]="Steve";
        strings[2]="Sue";
        strings[3]="Tony";
        strings[4]="Melba";

        Array array =new Array();
        array.displayArray(strings);

    }

    public void displayArray(String[] sts){
        for (int i = 0; i<sts.length; i++){
            System.out.print(sts[i]+", ");
        }
    }
}

