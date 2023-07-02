package Homeassignments;

public class Method {
	public int AddTwoNumbers(int a,int b)
	{
		return a+b;
	}
	public int  SubtractTwoNumbers(int c, int d) {
		return c-d;
	}
	public int DivideTwoNumbers(int e, int f) {
		return e/f;
	}
public static void main(String[] args) {
	Method  m = new Method();
	int a;
	a=m.AddTwoNumbers(10,20);
	System.out.println(a);
	System.out.println(m.SubtractTwoNumbers(40,20));
			System.out.println(m.DivideTwoNumbers(10,5));	
}
}
