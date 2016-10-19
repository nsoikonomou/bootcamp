
import java.util.Scanner;

class Quadratic{
	public static void main(String args[]){
	Scanner scanner =  new Scanner(System.in);

	System.out.print("Enter value for 'a': ");
	double a = scanner.nextDouble();

	System.out.print("Enter value for 'b': ");
	double b = scanner.nextDouble();

	System.out.print("Enter value for 'c': ");
	double c = scanner.nextDouble();

	if ((Math.pow(b,2) - (4*a*c)) < 0){
		System.out.println("No real-valued solutions exist.");
	}
	else
	{
		double sol1 = (-b + Math.sqrt( Math.pow(b,2) - (4*a*c))) / 2*a;
		double sol2 = (-b - Math.sqrt( Math.pow(b,2) - (4*a*c))) / 2*a;
		System.out.println("The solutions are " + sol1 + " and " + sol2);
	}

	}
}
