public class Problem39 {
	
	public static void main(String[] arg){
		long start = System.currentTimeMillis();
		int bestP = 0, maxSolutions = 0;
		
		for(int p = 2; p <= 1000; p += 2){
			int numSolutions = 0;
			for(int a = 2; a < p/3; a++){
				if( (p*p - 2*p*a)%(2*p - 2*a) == 0){
					numSolutions++;
				}
			}
			if(maxSolutions < numSolutions){
				maxSolutions = numSolutions;
				bestP = p;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println( "p = " + bestP + "\n" + (end-start) + " ms");
	}

}


