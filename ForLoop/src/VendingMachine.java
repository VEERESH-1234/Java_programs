
public class VendingMachine {
	public void Display(String a)
	{
		switch(a)
		{
		case "P001":System.out.println("TCS");
                    break;
        case "P002":System.out.println("Infosys");
                    break;
        case "P003":System.out.println("Wipro");
                    break;
        case "P004":System.out.println("Dell");
                    break;
        default :System.out.println("Invalid String");
		}
	}
}
