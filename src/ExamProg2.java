

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExamProg2 {
	public static void main(String[] args) {
		
		
		int[] in = new int[14];
		in[0] = 456;
		in[1] = 91456;
		in[2] = 456;
		in[3] = 56;
		in[4] = 456;
		in[5] = 456;
		in[6] = 56;
		in[7] = 1;
		in[8] = 1;
		in[9] = 456;
		in[10] = 456;
		in[11] = 456;
		in[12] = 456;
		in[13] = 456456;
		
		Set set = new TreeSet();
		
		for(int i = 0 ; i < in.length ; i++)
		{
			int i1 = in[i];
			set.add(i1);
		}
		System.out.println(set);
		
		List list = new ArrayList<>(set);
		Object minValue = list.get(0);
		
		Object maxValue = list.get(list.size()-1);
		System.out.println("Min value is : " + minValue);
		System.out.println("Max Value is : " + maxValue);
		
		
		
		
		
		}
}
