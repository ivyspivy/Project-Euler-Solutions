
public class PE14 {
	public static int[] arr = new int[1000000];
	public static long maxIndex;
	public static long maxValue = 0;
	
	public static void main(String[] args){
		findMax(2);
	}
	
	public static void findMax(int n){
		while( n < 1000000 ){	
			long count = 0;
			long cur = n;
			while(cur != 1){
				if(cur % 2 == 0){
					cur /= 2;
				}else{
					cur = 3*cur + 1;
				}
				count++;
				if(cur < 1000000){
					if(arr[(int) cur] != 0 ){ 
						count += arr[(int) cur];
						break;
					}
				}
			}
			arr[n] = (int) count;
			if(arr[n] > maxValue){
				maxValue = arr[n];
				maxIndex = n;
			}
			n++;
		}
		System.out.println(maxIndex);
	}
}


