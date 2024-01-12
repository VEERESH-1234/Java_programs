import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the age");//ask the user to enter the age
		int age=scan.nextInt();//read the age and stored in variable age
		VotingApp v=new VotingApp();//creating the object of VotingApp class
		v.eligible(age);//calling a VotingApp method

	}

}
