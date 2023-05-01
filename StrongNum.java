import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers :");
		int n= sc.nextInt();
			int res=isStrong(n);
			
			if(res==n)
				System.out.println("strong");
			else
				System.out.println("not a strong");
		
	}

	private static int isStrong(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(n>0) {
		int d=n%10;
		sum=sum+fact(d);
		n=n/10;
		}
		return sum;
		
	}

	private static int fact(int d) {
		// TODO Auto-generated method stub
		int fact=1;
		while(d>0) {
			fact=fact*d;
			d--;
		}
		
		return fact;
	}

}
