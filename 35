
public class problem35 {
	
	public final static boolean[] isComposite = sieve(1000000);
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int count = 0;
		for(int i = 2; i < 1000000; i++){
			if(!isComposite[i]){
				if( ifCircular(i)){
					count++;
				}
			}
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println(count);
		System.out.println("Execution time: " +(end-start)+ " ms");
	}
	
	public static boolean[] sieve(int limit){
		boolean[] a = new boolean[limit + 1];
		
		for(int i = 2; i < limit; i++){
			if(!a[i]){
				for(int q = i * 2; q < limit; q += i){
					a[q] = true;
				}
			}
		}
		return a;
	}
	
	public static boolean ifCircular(int n){
		String a = Integer.toString(n);
		String test = a;
		for(int i = 0; i < a.length(); i++){
			test = test.substring(1) + test.charAt(0);
			if(isComposite[Integer.parseInt(test)]){
				return false;
			}
		}
		
		
		return true;
	}
}


