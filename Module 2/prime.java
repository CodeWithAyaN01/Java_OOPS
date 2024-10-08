public class prime {
    public static void main(String[] args) {
                                                    // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
                                                    // Check if the current number is prime
            if (isPrime(i)) {
                // If it is prime, print it
                System.out.print(i + " ");
            }
        }
    }

                                                                             // Method to check if a number is prime
    public static boolean isPrime(int num) {
                                                                                    // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }
                                                                                                  // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;                                                                       // If divisible, it's not prime
            }
        }
        return true;                                                                                                    // If not divisible, it's prime
    }
}

    

