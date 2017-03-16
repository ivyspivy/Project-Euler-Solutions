
public class problem34 {
	public static int[] factorials = new int[10];
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int product = 1;
		factorials[0] = 1;
		for(int i = 1; i < factorials.length;i++){
			product *= i;
			factorials[i] = product;
		}
		
		int answer = 0;
		for(int i = 3; i < 1000000; i++){
			if(sumF(i)){
				answer += i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(answer);
		System.out.println("Execution time: " + (end-start) + " ms");
	}
	
	public static boolean sumF(int a){
		int sum = 0;
		String q = Integer.toString(a);
		for(int i = 0; i < q.length(); i++){
			sum += factorials[Character.getNumericValue(q.charAt(i))];
		}
		return sum == a;
	}
}


