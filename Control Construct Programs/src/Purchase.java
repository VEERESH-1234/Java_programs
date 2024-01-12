import java.util.Scanner;
public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//creating the object of scanner class
		System.out.println("Enter the price");//ask the user to enter the price
		double a=scan.nextDouble();//read the price value and stored in variable a
		PurchaseApp pu=new PurchaseApp();//creating the object of PurchaseApp class
		pu.amount(a);//calling a amount method
		
		

	}

}
