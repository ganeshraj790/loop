package forloop;

public class UpperLowerCount {
	public static void main(String[]args) {
		String name="GANesh";
		int uc=0;
		int lc=0;
		String a=name.toUpperCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==a.charAt(i)) {
				uc++;
				System.out.println(name.charAt(i)+"  "+a.charAt(i));
			}
			else {
				lc++;
				System.out.println(name.charAt(i)+"  "+a.charAt(i));
			}
		}
		System.out.println("upper count="+uc);
		System.out.println("lower count="+lc);
	}

}
