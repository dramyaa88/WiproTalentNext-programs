public static int pali(int input1)
	{
		int i;
		int h[] = new int[26];
		for(i = 0;i<h.length;i++)
		{
			h[i]=0;
		}
		while(input1>0)
		{
			h[input1%10]++;
			input1/=10;
		}
		int odd = 0;
		for(int j = 0;j<10;j++)
		{
			if(h[j] == 1)
			{
				odd++;
			}
			if(odd>1)
			{
				return 1;
			}
		}
		return 2;
	}
