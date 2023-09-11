package recitation;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countEvenDigit(12345);
	}
	
	public static void countEvenDigit(int num) {
		if (num < 0) {
			System.out.println("Error: input must be greater or equal to 0");
			return;
		}
		int total = 0;
		int current = num;
		while (current > 0) {
			if (current % 2 == 0) {
				total++;
			}
			current /= 10;
		}
		if (current > 1) {
			System.out.println("Total even digits are: " + total);
		} else {
			System.out.println("Total even digit is: " + total);
		}
	}

}
