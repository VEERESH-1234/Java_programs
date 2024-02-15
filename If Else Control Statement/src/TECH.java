import java.util.Scanner;

public class TECH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
		Techclub(marks);

	}
	public static void Techclub(int marks)
	{
		if(marks>90)
		{
			System.out.println("Welcome To Techclub");
		}
	}

}
