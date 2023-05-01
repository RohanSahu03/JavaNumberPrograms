import java.util.Scanner;

public class HappyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		boolean res=  isHappy(n);
		if(res)
			System.out.println("Happy");
		else
			System.out.println("unhappy");
		  

	}

	private static boolean isHappy(int n) {
		// TODO Auto-generated method stub
	
		while(n>9) {
			int sum=0;
			do {
			int d=n%10;
			sum=sum+d*d;
			n=n/10;
			}while(n!=0);
			n=sum;
		}
		return n==1 ||n==7;
		
	}

}
