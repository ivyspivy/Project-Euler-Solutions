import java.util.ArrayList;

public class Problem51 {
	/*
	 * Generate primes, check for repeating digits that are 0, 1, or 2
	 * if you find 8 of them stop
	 */
	static boolean[] isComposite = Sieve.sieve(1000000);
	
	public static void main(String[] ivy){
		long start = System.currentTimeMillis();
		int answer = 0;
		
		for(int i = 10000; i < 1000000; i++){
			if(!isComposite[i]){
				int repeat = hasRepeatingDigit(i);
				if(repeat != -1){
					if(has8primes(i, repeat)){
						answer = i;
						break;
					}
				}
			}
		}
		
		System.out.println(answer);
		long end = System.currentTimeMillis();
		System.out.println( (end - start) + " ms");
	}

	private static boolean has8primes(int num, int repeatingNumber) {
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		String s = String.valueOf(num);
		for(int i = 0; i < s.length(); i++){
			int c = Character.getNumericValue(s.charAt(i));
			if(c == repeatingNumber){
				indexes.add(i);
			}
		}

		int count = 0;
		for(int i = repeatingNumber; i < 10; i++){
			int test = replace(s, indexes, i);
			if (!isComposite[test]){
				count++;
			}
		}
		if(count == 8) return true;
		return false;
	}

	private static int replace(String s, ArrayList<Integer> indexes, int replacingNum) {
		// TODO Auto-generated method stub
		for (int index: indexes){
			s = s.substring(0, index) + String.valueOf(replacingNum) + s.substring(index + 1);
		}
		return Integer.valueOf(s);
	}

	private static int hasRepeatingDigit(int i) {
		// find repeating digit and if it is a 0, 1 or 2
		boolean[] numbers = new boolean[3];
		while( i != 0 ){
			if(i % 10 < 3){
				if(numbers[i % 10]){
					return i % 10;
				}else{
					numbers[i % 10] = true;
				}
			}
			i /= 10;
		}
		return -1;
	}
}


