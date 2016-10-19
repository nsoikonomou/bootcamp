
import java.util.Scanner;

class TriangularNumbers{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of triangle numbers: ");
		int numbers = scanner.nextInt();

		for (int i = 1; i <= numbers; i++){
			System.out.print(i*(i+1)/2 + " ");
		}
		System.out.println();
	}
}
