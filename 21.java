
public class problem21 {
	static int[] arr = new int[10000];
	static int sum = 0;
	
	public static void main(String[] args){
		for(int i = 4; i < 10000; i++){
			if( arr[i] == 0){
				d(i);
			}
		}
		System.out.println(sum);
	}
	
	public static void d(int a){
		int b = 0;
		int f = 1;
		while(f < a){
			if(a %  f == 0){
				b += f;
			}
			f++;
		}
		
		arr[a] = 10;
		if(b < 10000){
			arr[b] = 10;
		}
		
		int bsum = 0;
		f = 1;
		while(f < b){
			if(b %  f == 0){
				bsum += f;
			}
			f++;
		} 
		
		if( bsum == a && a != b){
			sum += (a+b);
		}
	}
}


