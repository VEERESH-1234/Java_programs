import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the number");//ask the user to enter the number
		int a=scan.nextInt();//read the number and stored in variable a
		Numbers n1=new Numbers();//creating the object of Numbers class
		n1.Display(a);//calling a Display method

	}

}
