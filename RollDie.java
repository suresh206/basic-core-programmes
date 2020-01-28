package funtionalprogrammes;

public class RollDie {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int x=rollDie(n);
		System.out.println();
		System.out.println("count= "+x);
		System.out.println("% of 6 "+x*100/n);
		
	}

	private static int rollDie(int n) {
		int count=0;
		for (int i = 1; i <= n; i++) {
			int res=(int) (Math.random()*6+1);
			System.out.print(res+" ");
			if (res==6) {
				count++;
			}
		}
		return count;
	}

}
