package basiccoreprogrammes;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tails=0,heads=0;
		int n=sc.nextInt();
		for (int i = 0; i <= n; i++) {
			double res=Math.random();
			if (res<=0.5) {
				heads++;
			} else {
				tails++;
			}
			
		}
		System.out.println("heads % is "+heads*100/(heads+tails));
		System.out.println("tails % is "+tails*100/(heads+tails));
		sc.close();

	}

}
