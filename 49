import java.util.Arrays;

public class problem49 {
	public static boolean[] composite = sieve(10000);

	public static void main(String[] args){
		
		long start = System.currentTimeMillis();
		boolean[] composite = sieve(10000);

		for(int i = 1488; i < composite.length; i++){
			if(!composite[i]){
				for( int a = i + 1; a < composite.length; a++){
					if(!composite[a] && isPerm(a,i)){
						int diff = a - i;
						int sum = a + diff;
						if(sum < composite.length && isPerm(sum,a) && !composite[sum]){
							System.out.print(i);
							System.out.print(a);
							System.out.println(sum);
							break;
						}
					}
				}
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start) + " ms");
	}
	
	static boolean[] sieve(int limit){
		boolean[] a = new boolean[limit + 1];
		a[0] = true;
		a[1] = true;
		for(int i = 2; i < a.length; i++){
			if(!a[i]){
				for(int q = i*2; q < a.length; q += i){
					a[q] = true;
				}
			}
		}
		return a;
	}
	
	static boolean isPerm(int a, int b){
		char[] arr1 = Integer.toString(a).toCharArray();
		char[] arr2 = Integer.toString(b).toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1,arr2);
	}
}


