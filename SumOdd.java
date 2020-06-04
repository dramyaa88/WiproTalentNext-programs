public class sumevod {
	public static int sum1(int input1)
	{
		int lastdigit = 0;
	    int odddigit = 0;
		
	    
			while(input1!=0)
			{
				lastdigit = input1%10;
	            
					if(lastdigit%2!=0)
					{
						odddigit+=lastdigit;
					}  
	            
				input1/=10;
			}
			
				return odddigit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumevod.sum1(2923));

	}

}
