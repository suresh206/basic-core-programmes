package basiccoreprogrammes;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i*i <= n; i++) {
			if (n%i==0) {
				PrimeChecking(i);
			}
		}
		sc.close();
	}

	private static void PrimeChecking(int i) {
		int count=0;
		for (int j = 2; j <= i/2; j++) {
			if (i%j==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println(i);
		}
	}

}
