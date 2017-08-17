
public class problem26 {
	public static void main(String[] args){
		int d = 0;
		int dlength = 0;
		
		boolean isComp[] = sieve(1000); 
		
		for(int i = 7; i <= 1000; i += 2){
			if(!isComp[i]){	
				int l = getCycle(i);
				if( l > dlength){
					dlength = l;
					d = i;
				}
			}
		}
		
		System.out.println(d);
	}

	public static int getCycle(int i) {
		int[] remainder = new int[1000];  //will put the position of the remainder in the remainder index
		int remain = 1; 
		int position = 0;
		while(remainder[remain] == 0 && remain != 0){
			remainder[remain] = position;
			remain = (remain*10)%i;
			position++;
		}
		
		return position - remainder[remain];
	}
	
	public static boolean[] sieve( int upper){
		boolean[] test = new boolean[upper + 1];
		for(int i = 2; i <= upper; i++){
			if(!test[i]){
				for(int a = i*2; a <= upper; a += i){
					test[a] = true;
				}
			}
		}
		return test;
	}
}


