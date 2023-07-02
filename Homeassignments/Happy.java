package Homeassignments;

import java.util.Scanner;

public class Happy {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("Enter a number to check if it is a happy number:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int t=n;            
		while(n!=1) {
			int r=0,s=0;
			while(n>0) {
				r=n%10;
				s=s+r*r;
				n=n/10;     

			}
			n=s;
			break;
		}
		if(t==1) {

			System.out.println("The number is a HappyNumber");

		}

		else {
			System.out.println("The number is not a Happynumber");
		}
	}
}




