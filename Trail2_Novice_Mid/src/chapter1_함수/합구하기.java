package chapter1_함수;

import java.util.Scanner;

public class 합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        f(n);

	}
	
	static void f(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		sum /= 10;
		System.out.println(sum);
	}
}
