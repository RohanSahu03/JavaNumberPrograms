import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n= sc.nextInt();
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println("factorial of "+n+" is "+fact);
	}

}
