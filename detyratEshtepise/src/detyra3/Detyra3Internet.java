package detyra3;

public class Detyra3Internet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        int[] arr = { 1,1,2,1,3,2,1,3,3,33,1,2,1,1,2,2,2,33,1,1,1 };
	        
	        int[] result = new int[4];
	        
	        int counter = 0, 
	        count = 0;
	        
	        for (int i = 0; i < arr.length; i++) {
	            boolean isDistinct = false;
	            for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    isDistinct = true;
	                    break;
	                }
	            }
	            if (!isDistinct) {
	                result[counter++] = arr[i];
	            }
	        }
	        for (int i = 0; i < counter; i++) {
	            count = 0;
	            for (int j = 0; j < arr.length; j++) {
	                if (result[i] == arr[j]) {
	                    count++;
	                }

	            }
	            System.out.println(result[i] + " = " + count);

	        }
		
	}

}
