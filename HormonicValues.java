package basiccoreprogrammes;

import java.util.Scanner;

public class HormonicValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=1;
		for (int i = 2; i<= n; i++) {
			sum=sum+(1.0/i);
		}
		System.out.println(sum);
		sc.close();
	}

}
