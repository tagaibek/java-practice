package projecteuler;

public class Problem14 {
    public static void main(String[] args) {
        int number = 1000;
        int result = getLongest(number);
        System.out.println(result);
    }

    private static int getLongest(int number) {
        int maxStartingNumber = 1;
        int maxLength = 1;

        for (int i = number - 1; i > 1; i--) {
            int iLength = getChainLength(i);
            if(iLength > maxLength){
                maxLength = iLength;
                maxStartingNumber = i;
            }
        }

        return maxStartingNumber;
    }

    private static int getChainLength(int number) {
        int length = 0;

        while (number != 1) {
            number = number % 2 == 0? number/2 : number*3 + 1;
            length++;
        }

        return length;
    }
}
