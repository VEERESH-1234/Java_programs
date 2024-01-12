import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the number");//ask the user to enter the number
		int num=scan.nextInt();//read the number and stored in variable num
		NumberApp n=new NumberApp();//creating the object of NumberApp class
		n.Display(num);//calling a Display method

	}

}
