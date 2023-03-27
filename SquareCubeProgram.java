package forloop;

public class SquareCubeProgram {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+"."+"even number"+i*i);
			}
			else {
				System.out.println(i+"."+"odd number"+i*i*i);
			}
		}
	}

}
