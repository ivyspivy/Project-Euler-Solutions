import java.math.BigInteger;
public class problem48 {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		BigInteger sum = BigInteger.ZERO;
		
		for(int i = 1; i < 1000; i++){
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		String a = sum.toString();
		long end = System.currentTimeMillis();
		
		
		System.out.println(a.substring(a.length() - 10));
		System.out.println("Execution time: " + (end - start) + " ms");
	}
}


