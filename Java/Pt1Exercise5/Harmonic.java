
class Harmonic{
	public static void main(String args[]){
	double sum = 1.0;
		for (int i=1; i<=5 ;i++){
			if (i==1){
				System.out.println((int)sum);
			}
			if (i > 1){
				double step = (double)1/i;
				sum = sum + step;
				System.out.println(sum);
			}
		}
	}
}
