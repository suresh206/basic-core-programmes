package funtionalprogrammes;

import java.util.Scanner;

public class Distance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int res=(int) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("Euclidean distance "+res);
		sc.close();
	}

}
