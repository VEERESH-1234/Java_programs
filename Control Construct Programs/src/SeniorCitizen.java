
public class SeniorCitizen {
	public void Discount(int age)
	{
		if(age>=60)//check whether the age is greater than 60
		{
			System.out.println("Discount is about 20%");
		}
		else if(age>=40 && age<=59)//check whether the age is in between 40 and 59
		{
			System.out.println("Discount is about 10%");
		}
		else
		{
			System.out.println("Disount is about 5%");
		}
	}

}
