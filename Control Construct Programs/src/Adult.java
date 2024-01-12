import java.util.Scanner;

public class Adult {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the age");//ask the user to enter a age
		int age=scan.nextInt();//Read the age and stored in variable age
		AdultApp n=new AdultApp();//creating the object of AdultApp class
		n.app(age);//calling a app method
	}

}
