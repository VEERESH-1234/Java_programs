import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the number");//ask the user to enter the number
		int a=scan.nextInt();//read a number and stored in variable a
		Multiplication m=new Multiplication();//creating the object of Multiplication class
		m.Display(a);//calling a Display method
		

	}

}
