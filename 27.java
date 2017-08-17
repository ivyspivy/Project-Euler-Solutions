
public class problem27 {
	static int aMax = 0;
	static int bMax = 0;
	static int nMax = 0;
	
	
	public static void main(String[] args){
		boolean[] isComp = sieve(50000);
		
		for(int b = -999; b <= 999; b += 2){
			if( !isComp[Math.abs(b)] ){
				for(int a = -999; a <= 999; a += 2){
					int n = 0;
					while(!isComp[Math.abs(n*(n + a) + b)]){
						n++;
					}
					if( n > nMax){
						aMax = a;
						bMax = b;
						nMax = n;
					}
				}
			}
			
		}
		
		System.out.println(aMax);
		System.out.println(bMax);
		System.out.println(aMax*bMax);
	}
	
	public static boolean[] sieve(int bound){
		boolean[] composite = new boolean[bound + 1];
		for(int i = 2; i <= bound; i++){
			if(!composite[i]){
				for(int a = i*2; a < bound; a += i){
					composite[a] = true;
				}
			}
		}
		return composite;
	}
}


