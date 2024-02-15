import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		NaturalNu N=new NaturalNu();
		N.Display(n);

	}

}
