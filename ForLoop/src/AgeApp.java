
public class AgeApp {
	public void Display(int age)
	{
		if(age>=0 && age<=12)
		{
			System.out.println("You are a Child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("You are a Teen");
		}
		else if(age>=20 && age<=59)
		{
			System.out.println("You are a Adult");
		}
		else
		{
			System.out.println("You are a Senior");
		}
	}

}
