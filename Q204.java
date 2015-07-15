import java.util.*;
import java.lang.*;

public class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] primes = new boolean[n];
        for (int i=0; i<n; i++) primes[i] = true;
        
        for (int i=2; i*i<n; i++) {
            if (isPrime(i)) {
                for (int j=i*2; j<n; j=j+i) primes[j] = false;
            }
        }
        int cnt = 0;
        for (int i=2; i<n; i++) {
            if (primes[i]) cnt++;
        }
        return cnt;
    }

    private boolean isPrime(int p) {
        for (int i=2; i<Math.sqrt(p); i++) {
            if (p%i == 0) return false;
        }
        return true;
    }

   public static void main(String[] args) {
       Solution slu = new Solution();
       System.out.println(slu.countPrimes(6));
   }
}
