package college;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class nonrepeat1 {
	public static int nons(int n)
	{
		ArrayList<Integer> net = new ArrayList<Integer>();
		while(n>0)
		{
			int r =n%10;
			n/=10;
			net.add(r);
		}
		Map<Integer,Integer> list = new HashMap<Integer,Integer>();
		for(int i = 0;i<net.size();i++)
		{
			if(list.containsKey(net.get(i)))
			{
				list.put(net.get(i), list.get(net.get(i))+1);
			}
			else
			{
				list.put(net.get(i), 1);
			}
		}
		int count=0;
		for(int  i = 0;i<net.size();i++)
		{
			if(list.get(net.get(i))==1)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 292;
		System.out.println(nonrepeat1.nons(n));

	}

}
