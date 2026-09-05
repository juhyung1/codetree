package Chapter1_Simulation;

import java.util.Scanner;

public class 금채굴 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        int result = 0;
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		
        		for(int k = 0; k <= 2; k++) {
        			int count = 0;
        			
        			for(int r = 0; r < n; r++) {
        				for(int c = 0; c < n; c++) {
        					int d = Math.abs(i-r) + Math.abs(j-c);
        					
        					if(d <= k && grid[r][c] == 1) {
        						count++;
        					}
        				}
        			}
        			
        			int cost = k*k + (k+1)*(k+1);
        			
        			if(count * m >= cost) {
        				result = Math.max(result, count);
        			}        		
        		}        		
        	}
        }        
        System.out.println(result);
	}

}
