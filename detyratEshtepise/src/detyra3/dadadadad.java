package detyra3;

public class dadadadad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 1, 2, 1, 3, 2, 1, 3, 3, 3, 1, 2, 1, 1, 2, 2, 2, 3, };

		int numDupes = 0;
		int numDupes1 = 0;

		for(int i = 1; i < numbers.length; i++) {
			
		    if(numbers[0] ==(numbers[i-1])) {
		       numDupes++;
		       for (int j = 0; j != i; j++){
				       numDupes1++;
				       break;
				       
				    
		       }
		    }
		    
		   
		    
		}

		System.out.println("Numeri 1 eshte perseritur " + " = " +  numDupes);
		System.out.println("Numeri 2 eshte perseritur " + " = " +  numDupes1);
			
			
			
			
			
			}

		}

	


