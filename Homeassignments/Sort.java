package Homeassignments;

import java.util.*;

public class Sort {

	
	// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,2,1,4,3};
		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
		int i;
		for(i=0;i<a.length;i++) {
			int count=1;	
				if(freq.containsKey(a[i])) {
					count=freq.get(a[i]);
					count++;
				}
				freq.put(a[i], count);
			}
		for(int j=0;j<a.length;j++)
		{
		if(freq.get(a[j])==1) {
					System.out.println(a[j]);
				}
		}
	}

}

	
