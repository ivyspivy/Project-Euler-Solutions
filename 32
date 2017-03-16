import java.util.Arrays;

public class problem32 {
	public static void main(String[] args){
		final long start = System.currentTimeMillis();
		int sum = 0;
		boolean[] ifProductPan = new boolean[10000];

		for(int i = 9876; i > 0; i--){
			if(findPanProd(i)){
				ifProductPan[i] = true;
			}
		}
		
		for (int i = 0; i < ifProductPan.length; i++){
			if(ifProductPan[i]){
				sum += i;
			}
		}
		
		final long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Execution Time: " + (end-start) + " ms");
	}
	
	public static boolean findPanProd(int n){
		for(int i = 2; i < 9876; i++){
			if( n % i == 0){
				if(isPandigital(concat(n, i, n/i))){
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean isPandigital(String a){
		if(a.length() == 9){
			char[] q = a.toCharArray();
			Arrays.sort(q);
			return String.valueOf(q).equals("123456789");
		}
		return false;
	}
	
	public static String concat(int a, int b, int c){
		return Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
	}
}	


