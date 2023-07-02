package Homeassignments;

import java.util.Scanner;

public class Switch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("The browser is edge");
		break;
		case 2:
			System.out.println("The browser is Chrome");
			break;
		case 3:
			System.out.println("The browser is Safari");
			break;
		
		default:
			System.out.println("the browser is not listed");
	}
	}
}
