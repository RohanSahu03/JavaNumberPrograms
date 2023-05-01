import java.util.Scanner;

public class Xylem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		 isXylem(n);
		 System.out.println("");

	}

	private static void isXylem(int n) {
		// TODO Auto-generated method stub
		int es=0,ms=0;
		int temp=n;
		while(n>0) {
		
			int d= n%10;
			if(temp==n||d==n)
				es =es+d;
			else
				ms=ms+d;
		}
		if(es==ms)
			System.out.println("xylem");
		else
			System.out.println("phloem");
		
	}

}
