package forloop;

public class PrintNameReverse {
	public static void main(String[]args) {
		String word="Ganesh";
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
			System.out.println(temp);
		
		}
		System.out.println(temp);
		
	}

}
