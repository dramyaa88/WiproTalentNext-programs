package college;

public class sumevod {
	public static int sum1(int input1)
	{
		int lastdigit = 0;
	    int evendigit = 0;
		
	    
			while(input1!=0)
			{
				lastdigit = input1%10;
	            
					if(lastdigit%2==0)
					{
						evendigit+=lastdigit;
					}  
	            
				input1/=10;
			}
			
				return evendigit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumevod.sum1(2923));

	}

}
