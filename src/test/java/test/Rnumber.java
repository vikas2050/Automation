package test;

public class Rnumber {
	public static void main(String[] args) {
		int num = 1234567;
		int rev = 0;
		while (num!=0) {
		int	mod = num%10;
			
			rev = rev*10+mod;
		num = num/10;
			
					
		}
		System.out.println(rev);
				
		
	}

}
