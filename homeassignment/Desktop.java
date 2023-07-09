package week3.homeassignment;

public class Desktop extends Computer {
	public void DesktopSize() {
		System.out.println("The size of the Desktop is 32 inches");
	}

	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.DesktopSize();
		des.ComputerModel();

	}

}
