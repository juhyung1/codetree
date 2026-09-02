package chapter1_함수;

public class one {
	
	public static void print5Stars(int N) {
		for(int i = 0; i < N; i++) {
			 for(int j = 0; j < 10; j++) {
			    	System.out.print("*");
			    }
			 System.out.println();
		}
	}


	public static void main(String[] args) {
		print5Stars(5);

	}

}
