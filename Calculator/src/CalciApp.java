
public class CalciApp {
	public static void operations(double a,double b,char operation)
	{
		if(operation=='+')
		{
			System.out.println(a+b);
		}
		else if(operation=='-')
		{
			System.out.println(a-b);
		}
		else if(operation=='*')
		{
			System.out.println(a*b);
		}
		else if(operation=='/')
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println("These ara not operated");
		}
	}

}
