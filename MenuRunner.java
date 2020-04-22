import java.util.Scanner;
public class MenuRunner
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the 1st nuber : ");
		int number1=scanner.nextInt();
		System.out.print("Enter the 2nd nuber : ");
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
		System.out.println("The result is :"+ result);
	}
}