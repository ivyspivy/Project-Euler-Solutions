
import java.util.ArrayList;
import java.util.List;
 
public class PE12 {
	public static void main(String[] args){
		int divisors = 1;
		int orig = 1;
		int add = 1;
		int count = 1;
		int num;
		
		while (true){
			num = orig;
			for (int i = 2; i <= num; i++) {
				while (num % i == 0) {
					num /= i;
		        	count++;
				}
				divisors *= count;
			    count = 1;
			    if(num == 1){
			    	break;
			    }
		    }
			if(divisors > 500){
				System.out.println(orig);
				break;
			}else{
				add++;
				orig += add;
				divisors = 1;
			}
		}
	}
}


