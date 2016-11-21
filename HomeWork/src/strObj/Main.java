package strObj;

public class Main {

	public static void main(String[] args) {
		String s1 = "Hello world!";
		String s2 = "Heasdasdllo worldadasd!";
		String s3 = "Helllo world!";
		String s4 = "Hello world! ";
		String s5 = "Hello world!";
		String s6 = "Hello worl!";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s6));
		
		System.out.println();
		
		System.out.println(myCompare(s1,s2));
		System.out.println(myCompare(s1,s3));
		System.out.println(myCompare(s1,s4));
		System.out.println(myCompare(s1,s5));
		System.out.println(myCompare(s1,s6));

	}
	
	static int myCompare (String s1, String s2){
		
		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			if (s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		
		return s1.length()-s2.length();		
	}

}
