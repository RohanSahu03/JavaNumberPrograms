import java.util.Scanner;

public class XylemOrPhloem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		 isXylem(n);
		 
	}

	private static void isXylem(int n) {
		// TODO Auto-generated method stub
		int lastDigit = n % 10;
		n /= 10;
		int middleDigitSum = 0;
		while(n >= 10) {
			middleDigitSum += n % 10;
			n /= 10;
		}
		
		int firstDigit = n;
		System.out.println((firstDigit + lastDigit) == middleDigitSum);
	}

}
