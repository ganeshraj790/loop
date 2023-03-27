package forloop;

public class PrintCharacterReverce {
	public static void main(String[]args) {
	String name="Ganesh";
	for(int i=name.length()-1;i>=0;i--) {
		System.out.println(name.charAt(i));
	}

}
}