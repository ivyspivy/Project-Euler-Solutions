public class Problem17 {
	
	public static void main(String[] args){
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++){
			int a = count(i);
			System.out.println(i + " is " + a);
			sum += a;
			System.out.println(sum);
			
		}
		System.out.println(sum);
	}
	
	public static int count(int n){
		int s = 0;
		if( n == 1000){
			return 11;
		}
		if( n/100 != 0){
			if( n/100 == 1 || n/100 == 2 ||n/100 == 6 ){
				s += 3;	
			}else if( n/100 == 3 ||n/100 == 7 ||n/100 == 8 ){
				s +=5;
			}else{
				s += 4;
			}
			n = n%100;
			s += 7; // hundred
			if(n > 0){
				s += 3; // and
			}
			
		}
		if( n > 19){
			if( n/10 == 2 ||  n/10 == 3 || n/10 == 8 || n/10 == 9){
				s += 6;
			}else if( n/10 == 4 || n/10 == 5 || n/10 == 6){
				s += 5;
			}else{
				s += 7;
			}
			n = n%10;
		}
		if( n <= 10 && n > 0){
			if( n== 1 || n == 2 ||n == 6 || n == 10 ){
				s += 3;	
			}else if( n == 3 ||n == 7 ||n == 8 ){
				s +=5;
			}else{ 
				s += 4;
			}
		}else if( n > 10 && n < 20){
			if( n == 11 ||  n == 12){
				s += 6;
			}else if( n == 15 || n == 16){
				s += 7;
			}else if( n == 13 || n == 14 || n == 18 || n == 19){
				s += 8;
			}else{
				s += 9;
			}
		}
			
		return s;
	}
}


