package com.Anudip;
import java.util.concurrent.*;

public class SumOfPrimes {

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int limit = 100; 
        int numThreads = 4; 

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        Future<Long>[] futures = new Future[numThreads];
        for (int i = 0; i < numThreads; i++) {
            final int threadId = i;
            futures[i] = executor.submit(() -> {
                long sum = 0;
                for (int num = threadId + 1; num <= limit; num += numThreads) {
                    if (isPrime(num)) {
                        sum += num;
                    }
                }
                return sum;
            });
        }

        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            totalSum += futures[i].get();
        }

        executor.shutdown();

        System.out.println("Sum of all prime numbers up to " + limit + " is: " + totalSum);
    }
}

/*
//Sum of all prime numbers up to 100 is: 1060
*/
