package chapter1_함수;

import java.util.Scanner;

public class 최소 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        f(a, b, c);
	}
	
	static void f(int a, int b, int c) {
		int min = Math.min(a, Math.min(b, c));
		System.out.println(min);
	}
}
