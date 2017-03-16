public class problem50 {
		public static void main(String[] args){
			runSieve(1000000);
		}
		
		public static void runSieve(int upperBound) {
			boolean [] ifComposite = new boolean[upperBound];
			for(int i = 2; i < upperBound; i++){
				if(!ifComposite[i]){
					for(int a = i*2; a < upperBound; a += i){
						ifComposite[a] = true;
					}
				}
			}

			int biggestPrimeSum = 0;
			int sum = 0;
			int fsum = 0;
			for(int a = 2; a < 1000000; a++){
				sum = 0;
				int numPrimes = 0;
				for( int i = a; i < 1000000; i++){
					if(!ifComposite[i]){
						sum += i;
						numPrimes++;
						if(sum >= 1000000){
							break;
						}
						
						if(!ifComposite[sum] && numPrimes > biggestPrimeSum && fsum < sum){
							biggestPrimeSum = numPrimes;
							fsum = sum;
						}
						
					}
					
				}
			}
			System.out.println(fsum);
		}
}

