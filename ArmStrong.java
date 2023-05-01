import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		  int res=isArm(n);
		  if(res==n)
			  System.out.println("Armstrong");
		  else
			  System.out.println("not");

	}

	private static int isArm(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int cd=countDigit(n);
		while(n>0) {
			int d=n%10;
			sum=sum+pow(d,cd);
			n=n/10;
		}
		return sum;
	}

	private static int pow(int d, int cd) {
		// TODO Auto-generated method stub
		int mul=1;
		while(cd>0) {
		mul=mul*d;
		cd--;
		}
		
		return mul;
	}

	private static int countDigit(int n) {
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
