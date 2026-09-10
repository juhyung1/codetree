package chapter5;

import java.util.*;


public class deque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
        	String str = sc.next();
        	switch(str) {
        	case "push_back":
        		q.offerLast(sc.nextInt());
        		break;
        	case "push_front":
        		q.offerFirst(sc.nextInt());
        		break;
        	case "pop_front":
        		System.out.println(q.pollFirst());
        		break;
        	case "pop_back":
        		System.out.println(q.pollLast());
        		break;
        	case "back":
        		System.out.println(q.peekLast());
        		break;
        	case "front":
        		System.out.println(q.peekFirst());
        		break;
        	case "size":
        		System.out.println(q.size());
        		break;
        	case "empty":
        		if(q.isEmpty()) {
        			System.out.println("1");
        		}
        		else {
        			System.out.println("0");
        		}
        	}
        }
	}

}
