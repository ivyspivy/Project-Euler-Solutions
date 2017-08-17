import java.math.BigInteger;
public class problem20 {
	public static void main(String[] args){
		
		BigInteger num = BigInteger.valueOf(1);
		for(int i = 1; i <= 100; i++){
			num = num.multiply(BigInteger.valueOf(i));
		}
		String s = num.toString();
		int sum = 0;
		for( int i = 0; i < s.length(); i++){
			sum += Integer.parseInt(s.substring(i, i+1));
		}
		System.out.println(sum);
	}
}


