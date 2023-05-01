import java.util.Scanner;

public class SumOfNnaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("enter number : ");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int res = Nnatural(n);
	System.out.println(res);

	}
	
	static int Nnatural(int x) {
		int sum=0;
		for(int i=1;i<=x;i++) {
			sum=sum+i;
		}
		return sum;
	}

}
