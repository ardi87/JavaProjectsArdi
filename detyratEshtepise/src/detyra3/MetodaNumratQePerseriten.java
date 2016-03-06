package detyra3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MetodaNumratQePerseriten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 1, 1, 1, 3, 3, 3, 4, 4, 4, 5, 55, 55, 6, 7, 7, 8,
				8 };
	
		Arrays.sort(numbers);

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i - 1]) {
				
				System.out.println("Duplicate: " + numbers[i]);
			}
			while (i < numbers.length && numbers[i] == numbers[i - 1])
				++i;
		}

	}
}
