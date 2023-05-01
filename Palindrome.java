import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		 boolean res= isPalindrome(n);
		 if(res) {
			 System.out.println("palindrome");
		 }
		 else
			 System.out.println("not palindrome");
	}

	private static boolean isPalindrome(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			int d= n%10;
			sum=(sum*10)+d;
			n=n/10;
		}
		return temp==sum;
		
	}

}
