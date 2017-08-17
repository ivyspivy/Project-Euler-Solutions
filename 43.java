public class Problem43 {
	static long sum = 0;
		
	public static void main(String[] args){
		
		long start = System.currentTimeMillis();
		
		permutation("", "0123456789");
		
		long end = System.currentTimeMillis();
		
		System.out.println("Execution time: " + (end-start) + "ms");
		
		System.out.println(sum);
	}
	
	private static boolean check(String a){
		String s = "0" + a; //to make the first digit index 1 for easy reading
		
		int d1 = Character.getNumericValue(s.charAt(1));
		int d4 = Character.getNumericValue(s.charAt(4));
		int d6 = Character.getNumericValue(s.charAt(6));
		
		if(Integer.parseInt(s.substring(2,5)) % 2 > 0)return false;
		if(Integer.parseInt(s.substring(3,6)) % 3 > 0)return false;
		if(Integer.parseInt(s.substring(4,7)) % 5 > 0)return false;
		if(Integer.parseInt(s.substring(5,8)) % 7 > 0)return false;
		if(Integer.parseInt(s.substring(6,9)) % 11 > 0)return false;
		if(Integer.parseInt(s.substring(7,10)) % 13 > 0)return false;
		if(Integer.parseInt(s.substring(8)) % 17 > 0)return false;
		
		return true;
	}
	
	private static void permutation(String prefix, String str) { 
		int n = str.length();
	    if (n == 0){
	    	if(check(prefix)){
	    		sum += Long.parseLong(prefix);
	    	}
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}


