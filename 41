public class problem41 {
	public static void main(String[] args){
		
		long start = System.currentTimeMillis();
		boolean[] isComposite = sieve(987654321);
		outerloop:
		for(int i = isComposite.length - 1; i >= 0; i--){
			if(!isComposite[i]){
				if(isPandigital(i)){
					System.out.println(i);
					break outerloop;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Exectution time: " + (end-start) + " ms");
		
	}
	
	public static boolean isPandigital(int i){
		String a = Integer.toString(i);
		int arrlength = a.length() + 1;
		boolean[] nums = new boolean[arrlength];
		nums[0] = true;
		for(int q = 0; q < a.length(); q++){
			int c = Character.getNumericValue(a.charAt(q));
			if(c > a.length() || nums[c]){
				return false;
			}
			nums[c] = true;
		}
		if(ifAllTrue(nums)){
			return true;
		}
		return false;
	}
	
	public static boolean ifAllTrue(boolean[] n){
		for(int i = 0; i < n.length; i++){
			if(!n[i]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean[] sieve(int limit){
		boolean[] a = new boolean[limit + 1];
		for(int i = 2; i <= limit; i++){
			if(!a[i]){
				for(int b = i*2; b <= limit; b += i){
					a[b] = true;
				}
			}
		}
		return a;
	}

}


