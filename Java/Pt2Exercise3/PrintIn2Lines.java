import java.util.Scanner;

class PrintIn2Lines{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 10 digit number: ");
		String numStr = scanner.nextLine();

		for (int i = 0; i < numStr.length(); i = i + 2){
			System.out.print(numStr.charAt(i) + " ");
		}
		System.out.println();
		for (int i = 1; i < numStr.length(); i = i + 2){
			System.out.print(" " + numStr.charAt(i));
		}
		System.out.println();
	}
}
