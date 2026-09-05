package Chapter1_Simulation;

import java.util.Scanner;

public class 트로미노 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < n-1; i++) {
        	for(int j = 0; j < m-1; j++) {
        		int sum1 = -grid[i][j+1];
        		int sum2 = -grid[i+1][j];
        		int sum3 = -grid[i][j];
        		int sum4 = -grid[i+1][j+1];
        		
        		for(int a = 0; a <= 1; a++) {
        			for(int b = 0; b <= 1; b++) {
        				sum1 += grid[i+a][j+b];
        				sum2 += grid[i+a][j+b];
        				sum3 += grid[i+a][j+b];
        				sum4 += grid[i+a][j+b];
        			}
        		}        		
        		max = Math.max(max, Math.max(sum1, Math.max(sum2, Math.max(sum3, sum4))));

        	}
        }
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m-2; j++) {
        		int sum5 = 0;
        		
        		for(int a = 0; a < 3; a++) {
        			sum5 += grid[i][j+a];
        		}
        		max = Math.max(max, sum5);
        	}
        }
        
        for(int i = 0; i < n-2; i++) {
        	for(int j = 0; j < m; j++) {
        		int sum6 = 0;
        		
        		for(int a = 0; a < 3; a++) {
        			sum6 += grid[i+a][j];
        		}
        		max = Math.max(max, sum6);
        	}
        }
        
        
        
        System.out.println(max);

	}

}
