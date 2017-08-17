
public class problem23 {
	public final static int limit = 28123;
	public static boolean[] nums = new boolean [limit + 1];  
	
	public static void main(String[] args){
		//find abundant numbers //done
		//mark numbers that can be created by sum of 2 abundant numbers
		//sums up all non-marked numbers
		
		
		int sum = 0;
		
		for(int i = 10; i < nums.length; i++){
			nums[i] = ifabundant(i);
		}
		
		
		//sums up all non-marked numbers
		for(int i = 0; i < nums.length; i++){
			if(!isSumOf2Abundants(i)){
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
	
	private static boolean isSumOf2Abundants(int n) {
		for (int i = 0; i <= n; i++) {
			if (nums[i] && nums[n - i])
				return true;
		}
		return false;
	}

	public static boolean ifabundant(int num){
		int divisorsum = 0;
		for(int i = 2; i <= Math.ceil(num/2); i++){
			if(num % i == 0){
				divisorsum += i;
			}
		}
		if( divisorsum > num){
			//num is abundant
			return true;
		}
		return false;
	}
}


