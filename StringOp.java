
public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Object obj[]= {34.5,7,67.1,6,8};
		
		int z=0;
		
		int[] ar = new int[obj.length];
		for (int j = 0; j < obj.length; j++)
		{
			if (obj[j] instanceof Integer) 
			{
				ar[z++] = (int) obj[j];

			}
		}
		int sum=0;
		for (int i = 0; i < ar.length; i++)
		{
			int c=0;
			for (int k = 0; k < ar.length; k++)
			   {
				if(ar[i]==ar[k]) 
				{
					c++;
				}
			   }
			if(c==1)
				sum=sum+ar[i];
				
		       }
		System.out.print(sum);
	   }	
		

	}
	
