import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		  printFib(n);

	}

	private static void printFib(int n) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		
		for (int i = 2; i < n; i++) {
			
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		
		
		
	}

}
