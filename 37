
public class problem37 {
	final static boolean[] composite = sieve(10000000);
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int numsRemaining = 11;
		int sum = 0;
		int i = 12;
		while (numsRemaining > 0){
			i++;
			if(!composite[i]){
				if(truncatable(i)){
					sum += i;
					numsRemaining--;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Execution time: " +(end-start) + " ms");
		
	}
	
	public static boolean truncatable(int i){
		String g = Integer.toString(i);
		String test;
		for(int n = 1; n < g.length(); n++){
			test = g.substring(0,n);
			if(composite[Integer.parseInt(test)]){
				return false;
			}
		}
		for(int n = 1; n < g.length(); n++){
			test = g.substring(n);
			if(composite[Integer.parseInt(test)]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean[] sieve(int limit){
		boolean[] a =  new boolean[limit + 1];
		a[0] = true;
		a[1] = true;
		for(int i = 2; i < a.length; i++){
			if(!a[i]){
				for(int q = i *2; q < a.length; q += i){
					a[q] = true;
				}
			}
		}
		return a;
	}
}


