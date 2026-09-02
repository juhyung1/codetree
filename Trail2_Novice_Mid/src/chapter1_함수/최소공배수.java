package chapter1_함수;

import java.util.Scanner;

public class 최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        f(n,m);

	}
	
	static void f(int a, int b) {
		int min = Math.min(a, b);
		int result = 0;
		for(int i = 1; i <= min; i++) {
			if(a%i == 0 && b%i == 0) {
				result = i;
			}
		}
		System.out.println(result * (a/result) * (b/result));
	}

}
