import java.util.Scanner;
public class MenuRunner
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the 1st number : ");

		int number1=scanner.nextInt();

		System.out.print("Enter the 2nd number : ");

		int number2=scanner.nextInt();

		System.out.println("1.add");
		System.out.println("2.subtract");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.print("Enter your choice :");

		int choice=scanner.nextInt();
		int result=0;

		if(choice==1)
		{
			result=number1+number2;
		}
		else if(choice==2)
		{
			result=number1-number2;
		}
		else if(choice==3)
		{
			result=number1*number2;
		}
		else if(choice==4)
		{
			result=number1/number2;
		}
		else
		{
			System.out.println("invalid input");
		}

		System.out.println("The result is :"+ result);
		
	}
}