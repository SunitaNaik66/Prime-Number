package practice;

public class IsPrime {
	public static void main(String[] args) {
		System.out.println(isPrime(49));//false
		System.out.println(isPrime(19));//true
		
		
	}
	public static boolean isPrime(Integer n) {
		if(n==0||n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i=0;i<=n/2;i++) {
			if(n%2==0) {
				return true;
			}
		}
		return false;
		
	}

}
