
public class problem31 {
	public final static int limit = 200;
	public final static int[] coinValue = {1,2,5,10,20,50,100,200};
	public static void main(String[] args){
		final long start = System.currentTimeMillis();
		int[] solutions = new int[limit + 1];
		solutions[0] = 1;
		
		for(int i = 1; i < coinValue.length; i++){
			for (int a = coinValue[i]; a <= limit; a++ ){
				solutions[a] += solutions[a - coinValue[i]];
			}
		}
		
		
		int count = 0;
		for(int i = 0; i < solutions.length; i++){
			count += solutions[i];
		}
		final long end = System.currentTimeMillis();
		System.out.println(count);
		System.out.println("Execution time: " + (end - start) + " ms");
	}
}


