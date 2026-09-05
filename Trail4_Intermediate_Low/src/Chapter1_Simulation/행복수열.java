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

			int cnt1 = 1;
			int cnt2 = 1;
			
			boolean isOk1 = false;
			boolean isOk2 = false;

			if (m == 1) {
				result += 2;
				continue;
			}
			for(int j = 1; j < n; j++) {
				if(grid[i][j] == grid[i][j-1]) {
					cnt1++;
					if(cnt1 == m) {
						isOk1 = true;
					}
				}
				else {
					cnt1 = 1;
				}
				
				if(grid[j][i] == grid[j-1][i]) {
					cnt2++;
					if(cnt2 == m) {
						isOk2 = true;
					}
				}
				else {
					cnt2 = 1;
				}
			}
			if(isOk1) {
				result++;
			}
			if(isOk2) {
				result++;
			}		

		}
		System.out.println(result);

	}

}
