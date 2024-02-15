import java.util.Scanner;

public class Side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=scan.nextInt();
		System.out.println("Enter the width");
		int w=scan.nextInt();
		System.out.println("Enter the breadth");
		int b=scan.nextInt();
		Sides S=new Sides();
		S.Display(l,w,b);
		

	}

}
