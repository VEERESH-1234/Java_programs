import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		double l=scan.nextDouble();
		System.out.println("Enter the width");
		double w=scan.nextDouble();
		Rectangleca R=new Rectangleca();
		R.Display(l,w);
		System.out.println((l*w));

	}

}
