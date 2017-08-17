import java.util.Arrays;

public class Problem52 {

	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int answer = 0;
		for(int i = 100000; i < 1000000; i++){
			if(isPerm(i, i*2) && isPerm(i, i*3) && isPerm(i, i*4) && isPerm(i, i*5) && isPerm(i, i*6)){
				answer = i;
				break;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println(answer);
		System.out.println((end - start) + " ms");
	}
	
	
	static boolean isPerm(int a, int b){
		char[] arr1 = Integer.toString(a).toCharArray();
		char[] arr2 = Integer.toString(b).toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1,arr2);
	}
}


