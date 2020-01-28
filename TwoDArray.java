package funtionalprogrammes;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int ar[][]=new int[m][m];
		File file=new File("suya.text");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw=new PrintWriter(file);
			for (int i = 0; i < ar.length; i++) {
				for (int j = 0; j < ar[i].length; j++) {
					pw.print(sc.nextInt()+" ");
				}
				pw.println();
			}
			pw.close();
			System.out.println("done the project");
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
