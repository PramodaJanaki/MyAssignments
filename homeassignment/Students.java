package week3.homeassignment;

public class Students {
	public void getStudentInfo(int id) {
		//passing id argument alone, by id & name, by email & phoneNumber
		id=1431;

		System.out.println("The student id is 1431");
	}
	public void getStudentInfo(int id, String name) {
		id= 14; name="Pramoda";
		
		System.out.println("The id and name of the student is ");
	}
	public void getStudentInfo(String email,float phonenumber) {
		email="pramodaangara@gmail.com";phonenumber=9866149864f;
		System.out.println("The email and phonenumber of the student is");
	}
	public static void main(String[]args) {
		Students s= new Students();
		s.getStudentInfo(1431);
		s.getStudentInfo(1431, "Pramoda");
		s.getStudentInfo("pramodaangara@gmail.com", 9866149864f);
	}

}
