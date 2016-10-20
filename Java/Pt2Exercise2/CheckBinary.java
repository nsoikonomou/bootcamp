import java.util.Scanner;

class CheckBinary{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter binary number: ");
	String binaryNumber = scanner.nextLine();

	int count = 0;

	for (int i=0; i<7; i++){
		if (binaryNumber.charAt(i) == '1'){
			count++;
		}
	}

	if ((count % 2 == 0 && binaryNumber.charAt(7) == '0') || (count % 2!=0 && binaryNumber.charAt(7) == '1')){
		System.out.println("Parity check OK.");
	}
	else{
		System.out.println("Parity check not OK.");
	}
	}
}
