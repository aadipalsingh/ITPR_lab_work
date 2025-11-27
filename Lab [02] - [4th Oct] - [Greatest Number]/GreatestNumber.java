
import java.util.Scanner;
public class GreatestNumber {
	public static void main(String[] args) {
		int num1,num2,num3;
		//creating object of scanner class
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter any three number : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
		}
		/*----------------------------------------------------*/
		//finding the greatest
		if(num1 == num2 && num1 == num3)
		{
			System.out.println("All are equal");
		}
		else if(num1 >=num2 && num1>= num3)
		{
			System.out.println(num1+" is the greatest number");
		}
		else if(num2 >=num1 && num2 >= num3)
		{
			System.out.println(num2+" is the greatest number");
		}
		else
		{
			System.out.println(num3+" is the greatest number");
		}

	}

}
