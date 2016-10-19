2import java.util.Scanner;

class TriangleArea{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Give the length of each side in order to compute the area of a triangle.");
		System.out.print("Give the length of side A: ");
		double lenA = scanner.nextDouble();
		System.out.print("Give the length of side B: ");
		double lenB = scanner.nextDouble();
		System.out.print("Give the length of side C: ");
		double lenC = scanner.nextDouble();

		double triangleArea = (1.0/4.0) * Math.sqrt((lenA+lenB+lenC) * (-lenA+lenB+lenC) * (lenA-lenB+lenC) * (lenA+lenB-lenC));
		System.out.println("The triangle area is: " + triangleArea);
	}

}