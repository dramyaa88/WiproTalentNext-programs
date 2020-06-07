public int pali(String input1,int input2)
{
String small = "abcdefghijklmnopqrstuvwxyz";
		int sum = 0,j;
		for(j=0;j<input1.length();j++)
		{
			if(input2==0)
			{
				char c = input1.charAt(j);
				if(Character.isUpperCase(c))
					c=Character.toLowerCase(c);
				if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
				{
					int index  = small.indexOf(c);
					if(index>=0)
					
						sum+=index+1;
					
				}
				else
				
					sum+=0;
				
			}
			else
			{
				char c = input1.charAt(j);
				if(Character.isUpperCase(c))
				
					c=Character.toLowerCase(c);
					int index  = small.indexOf(c);
				
				if(index>=0)
				
					sum+=index+1;
				
				else
					sum+=0;
			}
		}
		return sum;
    }
