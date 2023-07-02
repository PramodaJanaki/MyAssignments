package Homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=5;
		boolean IsPrime=true;
		for(i=2;i<=n;i++){
			if(n%i==0)
			{
				IsPrime= false;
				
			}

			if (IsPrime){
				System.out.println("True");
				break;
		
			}
		else{
			System.out.println("False");
			break;
		}       
	} 
}

}
