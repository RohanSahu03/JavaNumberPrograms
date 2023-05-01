import java.util.Scanner;

public class SpecialThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter number : ");
		  int n= sc.nextInt();
		 
		
		
			int temp=n;
			int sum=0;
			int prod=1;
			while(n>0) {
				int d = n%10;
				sum=sum+d;
				prod=prod*d;
				n=n/10;	
			}
			
			if(sum+prod==temp) { 
				System.out.println("special number"); 
			}
			else
				System.out.println("not a special number");
		
		}
	}

	
		
		
		
	

