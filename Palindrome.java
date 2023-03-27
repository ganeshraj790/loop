package forloop;

public class Palindrome {
	public static void main(String[]args) {
		String word="moM";
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
		}
		//System.out.println(temp);
		if(word.equalsIgnoreCase(temp)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	

}
