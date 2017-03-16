public class Problem53 {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int count = 0;
		
		int numRows = 100;
		int[][] pascal = new int[numRows + 1][(numRows +1) /2];
		for(int i = 0; i < pascal.length; i++){
			pascal[i][0] = 1;
		}
		for (int i = 1; i <= numRows; i++) {
		    for (int r = 1; r <= i/2; r++) {
		        pascal[i][r] = pascal[i - 1][r] + pascal[i - 1][r - 1];
		        if (r == i / 2 && i % 2 == 0)
		            pascal[i][r] += pascal[i - 1][r - 1];
		 
		        if (pascal[i][r] > 1000000) {
		            pascal[i][r] = 1000000;
		            count += i - 2 * r + 1;
		            break;
		        }
		    }
		}
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start) + " ms");
		System.out.println(count);
	}
}
