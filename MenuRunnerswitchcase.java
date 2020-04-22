import java.util.Scanner;
public class MenuRunnerswitchcase
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
		switch (choice) {
			case 1:
				result=number1+number2;
				break;
			case 2:
				result=number1-number2;
				break;
			case 3:
				result=number1*number2;
				break;
			case 4:
				result=number1/number2;
				break;
			default:
				System.out.println("invalid input");
		}
		System.out.println("The result is :"+ result);
	}
}