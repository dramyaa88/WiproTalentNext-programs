Write a program to print the element of an array that has occurred the highest number of times

Eg) Array -> 10,20,10,30,40,100,99
O/P:10

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMoreDup {
	public static int search(int arr[])
	{
		Map<Integer,Integer> hp = new HashMap<Integer,Integer>();
		for(int i = 0;i<arr.length;i++)
		{
			int key = arr[i];
			if(hp.containsKey(key))
			{
				int freq = hp.get(key);
				freq++;
				hp.put(key, freq);
			}
			else
			{
				hp.put(key,1);
			}
		}
		int max_count = 0,res = -1;
		for(Entry<Integer,Integer> val :hp.entrySet())
		{
			if(max_count<val.getValue())
			{
				res = val.getKey();
				max_count=val.getValue();
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,6,6,8,5,4,4,9};
		System.out.println(FindMoreDup.search(arr));

	}

}


