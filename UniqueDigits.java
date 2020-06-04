import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class nonrepeatdigit {
	public static int nonrepeat(int input1)
	{
		ArrayList<Integer> ne = new ArrayList<Integer>();
		while(input1>0)
		{
			int r =input1%10;
			ne.add(r);
			input1/=10;
		}
		Set<Integer> neq = new HashSet<Integer>(ne);
		return neq.size();
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonrepeatdigit.nonrepeat(292));
	}

}
