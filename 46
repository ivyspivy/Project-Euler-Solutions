
public class Problem46 {
	static boolean[] isComposite;
	
	/*
	 * find a composite odd number and then see if the difference
	 * of it and every prime under it is 2 times a square. If no, then stop
	 * and print number
	 * 
	 */
	
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		isComposite = Sieve.sieve(10000);
		
		outerloop:
		for(double i = 2; i < 10000; i++){
			if(isComposite[(int) i] && i % 2 == 1){
				boolean goodExample = false;
				for(double j = 2; j < i; j++){
					if(!isComposite[(int) j]){
						if( isSquare((i-j)/2)){
							goodExample = true;
							break;
						}
					}
				}
				if(!goodExample){
					System.out.println(i);
					break outerloop;
				}
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) + " ms");
	}

	private static boolean isSquare(double i) {
		int sqrt = (int) Math.sqrt(i);
		return i == Math.pow(sqrt, 2);
	}
}


