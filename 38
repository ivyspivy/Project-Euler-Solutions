import java.util.Arrays;

public class Problem38 {
	/*
	 * looking for 4 digit number
	 * pandigital num needs to start with 9
	 * look between 9876 and 9123 to find pan multiply by 1 and 2
	 */
	static String str;
	static int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] ivy){
		long start = System.currentTimeMillis();
		for(int i = 9876; i >= 9123; i--){
			str = String.valueOf(i) + String.valueOf(i*2);
			if(isPan(str)){
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(str);
		System.out.println((end - start) + " ms");
		
	}
	private static boolean isPan(String str) {
		// TODO Auto-generated method stub
		int[] array = toArray(str);
		Arrays.sort(array);
		
		return equal(arr, array);
	}
	private static boolean equal(int[] arr2, int[] arr) {
		if(arr2.length != arr.length){
			return false;
		}
		for(int i = 0; i < arr2.length; i++){
			if(arr2[i] != arr[i]){
				return false;
			}
		}
		return true;
	}
	private static int[] toArray(String str) {
		int[] a = new int[str.length()];
		for(int i = 0; i < str.length(); i++){
			a[i] = Character.getNumericValue(str.charAt(i));
		}
		return a;
	}
	
	
}


