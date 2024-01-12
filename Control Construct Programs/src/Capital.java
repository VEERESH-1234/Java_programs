import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the character");//ask the user to enter the character
		char a=scan.next().charAt(0);//read a character and stored in variable a
		CapitalL c=new CapitalL();//creating the object of CapitalL class
		c.Letter(a);//calling a Letter method
	}

}
