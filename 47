
public class Problem47 {
	private static boolean[] isComposite = Sieve.sieve(1000000);
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		int streak = 0;
		int i = 1000;

		while(streak < 4){
			if(ifPrimeFactors4(i)){
				streak++;
			}else{
				streak = 0;
			}
			i++;
		}
		System.out.println(i-4);
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start) + " ms");
	}
	
	public static int nextPrime(int start, boolean[] a){
		int i = start + 1;
		while(a[i]){
			i++;
		}
		return i;
	}
	
	public static boolean ifPrimeFactors4(int a){
		int currentPrime = 2;		
		int numOfPrimeFactors = 0; //resetting variables
		int test = a;
		int oldTest;
		
		while(test !=1){
			oldTest = test;
			while(test % currentPrime == 0){
				test /= currentPrime;
			}
			if(oldTest > test){
				numOfPrimeFactors++;
			}
			currentPrime = nextPrime(currentPrime, isComposite);
		}
		return numOfPrimeFactors == 4;
	}
}


