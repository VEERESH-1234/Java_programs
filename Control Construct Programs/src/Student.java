import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the grade");
		int grade=scan.nextInt();
		StudentMa St=new StudentMa();
		St.Result(grade);
		
		

	}

}
