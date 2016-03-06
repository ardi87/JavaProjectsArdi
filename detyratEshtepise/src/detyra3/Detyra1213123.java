package detyra3;

public class Detyra1213123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1,1,2,1,3,2,1,3,3,3,1,2,1,1,2,2,2,3,1,1,1 };

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1) {
				count++;
			}
		}
		
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == 2) {
				count1++;
			}
		}
		
		for (int k = 0; k < numbers.length; k++) {
			if (numbers[k] == 3) {
				count2++;
			}
		}
		
		System.out.println("Numri 1 perseritet: " + count + " herë.");
		System.out.println("Numri 2 perseritet: " + count1 + " herë.");
		System.out.println("Numri 3 perseritet: " + count2 + " herë.");
	}
}
