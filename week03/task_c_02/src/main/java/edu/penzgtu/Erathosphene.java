package edu.penzgtu;

import java.util.Arrays;

public class Erathosphene {
    private int limit;

    public Erathosphene(int limit) {
        this.limit = limit;
    }

    public void findPrimeNumbers() {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Prime numbers until " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
