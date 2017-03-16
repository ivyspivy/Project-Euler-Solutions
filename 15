import java.math.BigInteger;
public class Problem15 {
	public static void main(String[] args){
		int dim = 20;
		
		BigInteger top = BigInteger.valueOf(1);
 		for(int i = dim + 1; i <= 2*dim; i ++){
			top = top.multiply(BigInteger.valueOf(i));
			
		}
		
		BigInteger bottom = BigInteger.valueOf(1);
		for(int i = 1; i <= dim; i++){
			bottom = bottom.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println(top.divide(bottom));
		
	}
}


