package studio3;
import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = in.nextInt();

		int[] prime = new int[n+1];

		for (int i=0; i<prime.length; i++) {
			for (int j=2; j<prime.length; j++) {
				if (i%j==0 && prime[j] == 0 && i != j) {
					prime[i] = -1;	

				}
			}

		}
		for (int k = 2; k < prime.length; k++) {
			if (prime[k] != -1) {
				System.out.println(k);
			}
		}
	}
}	
