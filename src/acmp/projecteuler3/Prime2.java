package acmp.projecteuler3;


public class Prime2 {
    private static final Long number = 600851475143L;
    //private static final Long number = 13195L;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long d = number / 2;
        d += (d % 2 == 0) ? -1 : 0;
        long primeDiv = 0;

        for ( long i = d; i > 1; i-=2){
            if( number % i != 0){
                continue;
            }

            if ( isPrime(i) ){
                primeDiv = i;
                break;
            }
        }

        System.out.println(primeDiv);
        System.out.println("completed in: " + (System.currentTimeMillis() - start) + "ms");
    }

    private static boolean isPrime(long i){
        for ( long j = 3; j < i; j +=2){
            if(i % j == 0){
                return false;
            }
        }

        return true;
    }
}
