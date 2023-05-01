import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		  boolean perfectNum = perfectNum(n);
		  if(perfectNum) {
			  System.out.println("perfect num");
		  }
		  else {
			  System.out.println("not a perfect");
		  }
	}
	static boolean perfectNum(int n) {
		int sum=0;
		int temp=n;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum==temp;
	}
}
