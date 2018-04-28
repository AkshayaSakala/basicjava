
public class ApplicationUsingArray {
	public static void main(String[] args) {

		int y = 10000000;
		int[] primes = new int[y];
		primes[0]=2;
		int number;
		int count = 1;
		long startTime = System.currentTimeMillis();
		boolean isNumberPrime;
		for (number = 3; count < y; number++) {
			isNumberPrime = true;
			for (int primeIndex = 0; primes[primeIndex] < Math.sqrt(number); ++primeIndex) {

				if (0 == number % primes[primeIndex]) {
					isNumberPrime = false;
					break;
				}
			}

			if (isNumberPrime) {
				count = count + 1;
				System.out.println(number + " is prime");
				primes[count - 1] = number;
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println(count + " numbers are prime");
		System.out.println(endTime - startTime + " milliseconds");
	}
}
