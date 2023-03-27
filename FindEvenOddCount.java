package forloop;

public class FindEvenOddCount {
	public static void main(String[]args) {
		int even=0;
		int odd=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				even=even+1;
			}
			else {
				odd=odd+1;
			}
		}
		System.out.println("even count="+even);
		System.out.println("odd  count ="+odd);
	}

}
