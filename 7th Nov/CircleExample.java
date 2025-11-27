
import java.util.Scanner;
/*---- Defining a custom exception class ----------------*/
class RadiusException extends Exception
{
	public RadiusException(String msg)
	{
		super(msg);
	}
}
/*------------------------------------------------------*/
public class CircleExample {

	public static void main(String[] args) throws RadiusException
	{
		float radius;
		//Creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius of circle(in cm) : ");
		radius = sc.nextFloat();
		
		if(radius >= 0)
		{
			System.out.println("------- Circle -----");
			System.out.println("Radius : "+radius+" cm");
			System.out.println("Area : "+(3.14f*radius*radius)+" sq.cm");
		}
		else
		{
			//throw the exception
			throw new RadiusException("Radius cannot be negative");
		}

	}

}
