import java.util.Scanner;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of an array :");
		int n= sc.nextInt();
		int ar[]=new int[n];
		int ar1[] = new int[n];
		System.out.println("enter elements :");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.println("enter number : ");
		int x=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if(ar[i]==x) {
				ar1[0]=ar[i];
				break;
			}	
		}
		for(int i=1;i<n;i++) {
			ar1[i]=ar[i];
		}
		
		for(int j : ar1) {
			System.out.print(j+" ");
		}
		

	}

}
