public class problem28 {
	public static void main(String[] args){
		int sum = 1;
		for(int i = 3; i <= 1001; i += 2){
			sum += (i*i*4 - 6*i + 6);
		}
		System.out.println(sum);
	}
}


