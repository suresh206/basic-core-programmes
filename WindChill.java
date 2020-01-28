package funtionalprogrammes;

import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(args[0]);
		int v=Integer.parseInt(args[1]);
		if (t<50) {
			if (v<=3||v>=120) {
				double x=0.4275*t-35.75;
				double w=35.74+0.6215*t+Math.pow(v, 0.16)*x;
				System.out.println(w);
			} else {
				System.out.println(v+" not valid");
			}
			
		} else {
			System.out.println(t+" not valid ");
		}
		sc.close();
	}
}
