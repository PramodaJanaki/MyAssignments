package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int n1=0;
		int n2=1;
		int n3 ;
		System.out.println(n1);
		System.out.println(n2);
for(int i=3;i<=num;i++) {
	n3=n1+n2;
	System.out.println(n3);
n1=n2;
n2=n3;

}
	}

}
