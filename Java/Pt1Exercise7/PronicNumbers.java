import java.util.Scanner;

class PronicNumbers{
	public static void main(String args[]){

	Scanner scanner =  new Scanner(System.in);
	System.out.print("Enter number of pronic numbers: ");
	int numbers = scanner.nextInt();

	for (int i = 1; i <= numbers ;i++){
		System.out.print(i*(i+1) + " ");
	}
	System.out.println();
	}
}
