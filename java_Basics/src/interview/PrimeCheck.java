package interview;

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}

//We loop till n/2 and check divisibility. If divisible, it's not prime.