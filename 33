
public class Problem33 {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int numerator = 1;
		int denominator = 1;
		
		/*two digit nums only, denominator has to be bigger than 
		* numerator
		*need to test if nTens = dOnes or nOnes = dTens (cancelling)
		*then test if the remaining numbers are equal to n/d
		*/
		for(int d = 10; d < 100; d++){
			for (int n = 10; n < d; n++){
				int nOnes = n%10;
				int nTens = n/10;
				int dOnes = d%10;
				int dTens = d/10;	
				if((nOnes == dTens && nTens*d == dOnes*n)|| (nTens == dOnes && nOnes*d == dTens*n)){
					numerator *= n;
					denominator *= d;			
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start) + " ms");
		System.out.println("Numerator: " + numerator);
		System.out.println("Denominator: " + denominator);
	}
}


