package Homeassignments;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,10,12};
int b[]= {2,4,6,8,10,12};
int length= a.length; 
for(int i=0;i<a.length;i++) {
	for(int j=0;j<b.length;j++) {
		if(a[i]==b[j]) {
			System.out.println(a[i]);
		}
	}
}
			System.out.println("The length of the array is"  + length);
		}
	}

	


