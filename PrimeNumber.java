package forloop;

public class PrimeNumber {
	public static void main(String[]args) {
		int num=7;
		boolean re=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				re=false;
			}
		}
		if(re==true) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime number");
		}
	}

}
