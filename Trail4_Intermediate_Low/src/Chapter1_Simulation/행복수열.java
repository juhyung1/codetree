package Chapter1_Simulation;

import java.util.Scanner;

public class 행복수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] grid = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		int result = 0;

		for (int i = 0; i < n; i++) {

			int rCount = 1;
			int cCount = 1;

			if (m == 1) {
				result += 2;
				continue;
			}
			for(int j = 1; j < n; j++) {
				if(grid[i][j] == grid[i][j-1]) {
					rCount++;
					if(rCount == m) {
						result++;
						break;
					}
				}
				else {
					rCount = 1;
				}
				
				if(grid[j][i] == grid[j-1][i]) {
					cCount++;
					if(cCount == m) {
						result++;
						break;
					}
				}
				else {
					cCount = 1;
				}
			}
			
			

		}
		System.out.println(result);

	}

}
