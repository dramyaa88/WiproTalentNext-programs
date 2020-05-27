Write a function to find the count of even or odd depending upon the sixth input

class IsEvenOdd
{
public int numbers(int input1,int input2,int input3,int input4,int input5,String input6)
{
int count = 0;
		if(input6=="even")
		{
			
			if(input1%2==0 || input1==0)
				count++;
			if(input2%2==0 || input2==0)
				count++;
			if(input3%2==0 || input3==0)
				count++;
			if(input4%2==0 || input4==0)
				count++;
			if(input5%2==0 || input5==0)
				count++;
		}
		else
		{
		
			if(input1%2!=0)
				count++;
			if(input2%2!=0)
				count++;
			if(input3%2!=0)
				count++;
			if(input4%2!=0)
				count++;
			if(input5%2!=0)
				count++;
		}
	
	return count;
}
}
