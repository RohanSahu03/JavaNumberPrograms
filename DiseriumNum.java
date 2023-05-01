import java.util.Scanner;

public class DiseriumNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		 boolean res= isDiserium(n);
		 if(res)
			 System.out.println("Diserium");
		 else
			 System.out.println("Not a Diserium");
	

	}

	private static boolean isDiserium(int n) {
		// TODO Auto-generated method stub
		int ct=count(n);
		int sum=0;
		int temp=n;
		while(n>0) {
			int d=n%10;
			sum=sum+pow(d,ct);
			ct--;
			n=n/10;
		}
		return sum==temp;
	}

	private static int pow(int d, int ct) {
		// TODO Auto-generated method stub
		int power=1;
		if(ct==0)
			return 1;
		if(d==0)
			return 0;
		for(int i=0;i<ct;i++) {
			power=power*d;
		}
		return power;
	}

	private static int  count(int n) {
		// TODO Auto-generated method stub
		int count=0;
		while(n>0) {
			int d=n%10;
			count++;
			n=n/10;
		}
		return count;
	}

}
