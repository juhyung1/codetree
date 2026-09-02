package chapter1_함수;

import java.util.Scanner;

public class 최대공약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        gcd(n,m);

	}
	
	static void gcd(int a, int b) {
		int min = Math.min(a, b);
		int result = 0;
		for(int num = 1; num <= min; num++) {
			if( (a % num) == 0 && (b % num) == 0) {
				result = num;
			}
		}
		
		System.out.println(result);
	}

}
