import java.util.Scanner;

class ValidateTIN {
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Tax Identification Number: ");
	String taxNumber = scanner.nextLine();

	double digits[] = new double[8];
	double checkDigit = Double.parseDouble(taxNumber.substring(8,9));
	double sumOfPowers = 0.0;

	for (int i=0, j=7; i<=7 && j>=0; i++, j--){
		digits[i] = Double.parseDouble(taxNumber.substring(j,j+1)) * Math.pow(2,i+1);
	}

	for (int x=0; x<digits.length; x++){
		sumOfPowers = sumOfPowers + digits[x];
	}

	double result = (sumOfPowers % 11) % 10;
	if (result == checkDigit){
		System.out.println("Tax Identification Number valid.");
	}
	else{
		System.out.println("Tax Identification Number not valid.");
	}

	}
}
