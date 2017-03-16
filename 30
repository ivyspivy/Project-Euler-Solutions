public class problem30 {
	public static int[] nums = new int[10];
	public static void main(String[] args){
		final long start = System.currentTimeMillis();
		for(int i = 0; i < nums.length; i++){
			nums[i] = i*i*i*i*i;
		}
		
		int answer = 0;
		for(int i = 2; i < nums[nums.length -1]*6; i++){
			if(ifIsSumOfDigits(i)){
				answer += i;
			}
		}
		final long end = System.currentTimeMillis();
		System.out.println(answer);
		System.out.println("Solution took: " + (end-start) + "ms");
		
		
	}
	
	public static boolean ifIsSumOfDigits(int i){
		int sumPow = 0;
		String num = Integer.toString(i);
		for(int a = 0; a < num.length(); a++){
			int q = Character.getNumericValue(num.charAt(a));
			sumPow += nums[q];
			if(sumPow > i){
				return false;
			}
		}
		if(sumPow == i){
			return true;
		}
		return false;
	}
}



