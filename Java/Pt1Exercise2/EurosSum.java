import java.util.Scanner;

public class EurosSum2{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);

	int euros[] = {50, 20, 10, 5, 2, 1};
	int numNotesCoins[] = new int[6];
	int total = 0;

	for (int i=0; i<euros.length; i++){
		if (i < 4){
			System.out.print("Enter number of " + euros[i] + " euro banknotes: ");
		}
		else {
			System.out.print("Enter number of " + euros[i] + " euro coins: ");
		}
		numNotesCoins[i] = scanner.nextInt();
	}

	for (int j=0; j < numNotesCoins.length; j++){
		total += numNotesCoins[j] * euros[j];
	}

	System.out.println("You have " + total + " euros.");
	}
}
