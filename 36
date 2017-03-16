
public class problem36 {
	public static boolean[] palindrome = findP(1000000); 
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int sum = 0;
		for(int i = 0; i < palindrome.length; i++){
			if(palindrome[i] && isPal(Integer.toBinaryString(i))){
				sum += i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Execution time: " +(end- start) + " ms");
	}
	
	public static boolean[] findP(int limit){
		boolean[] a = new boolean[limit + 1];
		for(int i = 0; i < a.length; i++){
			if(isPal(Integer.toString(i))){
				a[i] = true;
			}
		}
		return a;
	}
	
	public static boolean isPal(String a){
		return a.equals(reverse(a));
	}
	
	public static String reverse(String a){
		String b = "";
		for(int i = a.length() -1; i >= 0; i--){
			b += a.charAt(i);
		}
		return b;
	}
}


