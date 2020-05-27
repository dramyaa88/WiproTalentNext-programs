Write a function to count the odd numbers

class Isodd
{
public int numbers(int input1,int input2,int inpu3,int input4,int input5)
{
    int count = 0;
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
		
		return count;
}
}
