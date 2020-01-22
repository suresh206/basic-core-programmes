package basiccoreprogrammes;

import java.util.Scanner;

public class PowerValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n <= 30) {
			for (int i = 0; i <= n; i++) {
				int res=(int) Math.pow(2, i);
				System.out.println(res);
			}
		} else {
			System.out.println("invalid input");
		}
		sc.close();
	}

}
