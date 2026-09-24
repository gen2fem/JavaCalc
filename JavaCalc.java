import java.util.Scanner;

public class JavaCalc {
	public static void main(String[] args) {
		//beggining

		Scanner sc = new Scanner(System.in);
                
		//Welcome
		System.out.println(" ");
		System.out.println("JavaCalc v1.0");
		System.out.println("=============");
		System.out.println(" ");

		//Calculation
                System.out.print("Enter 1st number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter 2nd number: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter the operation (+,-,/,*): ");
		String operation = sc.next();

		double total = 0;
		switch (operation) {
			case "+": total = num1 + num2; break;
			case "-": total = num1 - num2; break;
			case "/": total = num1 / num2; break;
			case "*": total = num1 * num2; break;
			default:
				  System.out.println("Invalid operation");
                        return;
		}

                //Results (output)
		System.out.println("Total: ");
		System.out.println(num1 + " " + operation + " " + num2 + " = " + total);
		System.out.println(" ");

		//end
	}
}
