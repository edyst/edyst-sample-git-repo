public class PrimeChecker {
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }

  // improved checker, checks for 2 and all odd factors uptil the square root of the number
  // if found, n is not prime
  public static boolean isPrime(int n) {
    //check if n is a multiple of 2
    if (n % 2 == 0) return false;
    //if not, then just check the odd factors until the square root of n
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}