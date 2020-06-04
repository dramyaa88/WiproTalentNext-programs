package college;

public class sumevod {
	public static int sum1(int input1,String input2)
	{
		int lastdigit = 0;
	    int evendigit = 0;
		int odddigit = 0;
	    
			while(input1!=0)
			{
				lastdigit = input1%10;
	            if(input2=="odd")
	            {
					if(lastdigit%2!=0)
					{
						odddigit+=lastdigit;
					}
	            }
	            else
	            {
					if(lastdigit%2==0)
					{
						evendigit+=lastdigit;
					}  
	            }
				input1/=10;
			}
			if(input2=="odd")
				return odddigit;
			else
				return evendigit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumevod.sum1(2923, "odd"));

	}

}
