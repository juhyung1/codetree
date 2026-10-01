package chapter9;

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        boolean isOk = false;
        
        int[] arr = new int [101];
        for(int i = x1; i <= x2; i++) {
            arr[i]++;
        }
        for(int i = x3; i <= x4; i++) {
            arr[i]++;
        }

        for(int i = 0; i < 100; i++) {
            if(arr[i] == 2) {
                isOk = true;
            }
        }

        if(isOk) {
            System.out.print("intersecting");
        }
        else {
            System.out.print("nonintersecting");
        }

    }
}