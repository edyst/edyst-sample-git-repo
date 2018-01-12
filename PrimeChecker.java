public class PrimeChecker {
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }

  // improved checker, checks for factors from (2 to n/2)
  // if found, n is not prime
  public static boolean isPrime(int n) {
    for (int i = 2; 2 * i < n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}