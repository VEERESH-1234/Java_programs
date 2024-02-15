
public class Program {
	public static void Calci(double a,double b,char operation)
	{
		if(operation=='+')
		{
			System.out.println(a+b);
		}
		else
		{
			if(a>b)
			{
				System.out.println(a-b);
			}
			else
			{
				System.out.println(b-a);
			}
		}
	}

}
