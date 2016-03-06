package detyra3;

import java.util.Arrays;

public class Detyra3Ardi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 1, 2, 1, 3, 2, 1, 3, 3, 3, 1, 2, 1, 1, 2, 2, 2, 3,
				1, 1, 1 };

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		// start
		Arrays.sort(numbers);

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i - 1]) {
				System.out.println("Duplicate: " + numbers[i]);
			}
			while (i < numbers.length && numbers[i] == numbers[i - 1])
				++i;
		}
		// ....

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1) {
				count++;

			}
			if (numbers[i] == 2) {
				count1++;
			}
			if (numbers[i] == 3) {
				count2++;
			}
		}

		System.out.println("Numri 1 perseritet: " + count + " herë.");
		System.out.println("Numri 2 perseritet: " + count1 + " herë.");
		System.out.println("Numri 3 perseritet: " + count2 + " herë.");

	}

}
