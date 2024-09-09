package LAB2;

import java.util.Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        int n=20;
        boolean[] primes=new boolean[n];
        Arrays.fill(primes, true);
        int result=0;
        for (int i=2; i<n; i++) {
            if (primes[i]) {
                result++;
                for (int j=i+i; j<n; j+=i) {
                    primes[j]=false;
                }
            }
        }
        System.out.println(result);
    }
}
