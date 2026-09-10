package chapter5;

import java.util.*;

public class 원형순열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i <= n; i++) {
        	q.offer(i);
        }
        
        while(!q.isEmpty()) {
        	for(int i = 0; i < k-1; i++) {
        		q.offer(q.poll());
        		
        	}
        	System.out.print(q.poll() + " ");
        }
        
        

	}

}
