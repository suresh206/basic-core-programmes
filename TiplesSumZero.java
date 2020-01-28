package funtionalprogrammes;

import java.util.Scanner;

public class TiplesSumZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		findTuples(a,n);
		sc.close();

	}

	private static void findTuples(int[] a, int n) {
		boolean res=true;
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					if (a[i]+a[j]+a[k]==0) {
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
						res=true;
					}
				}
			}
		}
		if (res==false) {
			System.out.println("not exist");		
		}
	}
}
