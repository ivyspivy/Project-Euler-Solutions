
public class Problem40 {
	private static int product = 1;
	private static int index = 0;
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int i = 0;
		String num;
		
		while(index <= 1000000){
			i++;
			num = Integer.toString(i);
			for(int a = 0; a < num.length(); a++){
				index++;
				check(num.charAt(a));
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Execution Time: " + (end-start) + "ms");
		System.out.println(product);
	}
	
	public static void check(char c){
		if(index == 10 || index == 100 || index == 1000 || index == 10000 || index == 100000 || index == 1000000){
			product *= Character.getNumericValue(c);
		}
	}
}


