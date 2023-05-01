import java.util.Scanner;

public class BiggestamgThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers :");
		int n1= sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2&&n1>n3)
			System.out.println(n1);
		else if(n2>n3) 
			System.out.println(n2);
		else
			System.out.println(n3);
		
		//using ternary operator
		
		int res=n1>n2&&n1>n3?n1:n2>n3?n2:n3;
		System.out.println(res);
			
		
	}

}
