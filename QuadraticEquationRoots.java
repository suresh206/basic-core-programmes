package funtionalprogrammes;

import java.util.Scanner;

public class QuadraticEquationRoots {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int delta=(int) Math.sqrt(b*b-4*a*c);
	System.out.println("Roots x "+(-b+delta)/(2*a));
	System.out.println("Roots x "+(-b-delta)/(2*a));
	sc.close();
	}

}
