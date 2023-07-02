package Homeassignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1,5,7,6};
		Arrays.sort(a); 

		for(int i=1;i<a.length;i++) {
			if(a[i-1]!=i) {	
				System.out.println("The missing element is" +i);
				break;
			}
		}
	}
}
