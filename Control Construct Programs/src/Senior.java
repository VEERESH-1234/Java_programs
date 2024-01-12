import java.util.Scanner;

public class Senior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the age");//ask the user to enter the age
		int age=scan.nextInt();//read the age and stored in variable age
		SeniorCitizen s1=new SeniorCitizen();//creating the object of SeniorCitizen class 
		s1.Discount(age);//calling a Discount method
		
				

	}

}
