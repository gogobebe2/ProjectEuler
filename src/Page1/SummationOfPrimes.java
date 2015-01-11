package Page1;

//Problem 10
public class SummationOfPrimes {
    public static final int ALL_PRIMES_BELOW = 2_000_000;

    public static void main(String args[]) {
        long begTime = System.currentTimeMillis();
        long sumPrimes = 0;
        for (int guess = 2; guess < ALL_PRIMES_BELOW; guess++) {
            boolean testFailed = false;
            //Trial and error
            if (guess % 2 == 0 && guess != 2) {
                testFailed = true;
            } else {
                for (int numbersBelowGuess = 3; numbersBelowGuess < Math.sqrt(guess + 1); numbersBelowGuess += 2) {
                    if (guess % numbersBelowGuess == 0) {
                        testFailed = true;
                    }
                }
            }
                /* //Fermat's Little Theorem
                if (Math.pow(3, guess) % guess != 3 % guess) {
                    testFailed = true;
                }*/


            if (!testFailed) {
                System.out.println("Lol, just found a prime! " + guess);
                sumPrimes += guess;
            }
        }
        System.out.println("The sum of all the primes that are below " + ALL_PRIMES_BELOW + " is " + sumPrimes + ".");
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken to run this bad boy: " + (endTime - begTime) + " mili-seconds");
    }



}

/*
OUTPUT FOR: 2_000_000 as ALL_PRIMES_BELOW value:

The sum of all the primes that are below 2_000_000 is 142913828922.
Total time taken to run this bad boy: 6671 mili-seconds
*/



