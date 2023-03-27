package forloop;

public class BreakSkipProgram {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			else {
				System.out.println("continue="+i);
			}
		}
		for(int i=1;i<=10;i++) {
			if(i%7==0) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
