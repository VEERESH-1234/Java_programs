import java.util.Scanner;

public class Vending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=scan.nextLine();
		VendingMachine V=new VendingMachine();
		V.Display(a);

	}

}
