import java.util.Arrays;
public class problem44 {
	public static boolean isPentagonal(long pentagonal[], long value) {
		return Arrays.binarySearch(pentagonal, value) >= 0;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long pentagonal[] = new long[10000];
		for (long i=1; i<10000; i++) {
			pentagonal[(int)i] = (i*3*i - i)/2;
		}
		
		for (int i=1; i<10000; i++) {
			for (int j=1; j<i; j++) {
				if (isPentagonal(pentagonal, pentagonal[i]+pentagonal[j]) &&
					isPentagonal(pentagonal, pentagonal[i]-pentagonal[j])) {
					System.out.println((pentagonal[i]-pentagonal[j]));
					long end = System.currentTimeMillis();
					System.out.println("Execution time: " + (end - start) + " ms");
					break;
				}
			}
		}
		
	}

}


