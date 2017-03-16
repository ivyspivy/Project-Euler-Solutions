import java.math.BigInteger;
public class PE16 {
	public static void main(String[] args){
		System.out.println(addDigits(1000));
	}
	
	public static int addDigits(int n)16{
		BigInteger a = BigInteger.valueOf(2);
		a = a.pow(n);
		
		String s = a.toString();
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++){
			sum += Integer.parseInt(s.substring(i, i + 1));
			
		}
		return sum;
	}
}


