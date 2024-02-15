import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		EvenNumbers E=new EvenNumbers();
		E.Display(n);

	}

}
