import java.util.HashSet;
import java.math.BigInteger;
public class problem29 {
	public static void main(String[] args){
		HashSet terms = new HashSet();
		for(int a = 2; a <= 100; a++ ){
			BigInteger BigA = BigInteger.valueOf(a);
			for(int b = 2; b<=100; b++){
				BigInteger num = BigA.pow(b);
				terms.add(num);
			}
		}
		System.out.println(terms.size());
	}
}


