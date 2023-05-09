package test;

public class Reverse {

	public static void main(String[] args) {
		String s = "My name is vikas kumawat";
		String rev="";
		int len = s.length();
		for( int i=0;i>len;i++) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);

	}

}