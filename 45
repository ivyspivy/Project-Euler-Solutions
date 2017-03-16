
public class problem45 {
	final static long bound = 100000;
	public static void main(String[] args){
		long start = System.currentTimeMillis();
	
		long i = 40756;
		outerloop:
		while(true){
			if(hex(i)){
				if(pent(i)){
					if(tri(i)){
						System.out.println(i);
						break outerloop;
					}
				}
			}
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start) + "ms");
	}
	
	public static boolean hex(long a){
		double test = (1 + Math.sqrt(1+a*8))/4;
		return test == (int) test;
	}
	
	public static boolean pent(long a){
		double test = (1 + Math.sqrt(1+a*24))/6;
		return test == (int) test;
	}
	
	public static boolean tri(long a){
		double test = (Math.sqrt(1+a*8) -1)/2;
		return test == (int) test;
	}
}
	

