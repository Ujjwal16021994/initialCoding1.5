package com.ujjwal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] gas = new int[] {1,2,3,4,5};
        int[] cost = new int[] {3,4,5,1,2};
        int n = cost.length;
        int gascontained =0;
        int index=0;
        int a=0;
        while (a<n) {
            for (int i = 0; i < n; i++) {
                if (cost[i] < gas[i]) {
                    gascontained += cost[i] - gas[i];
                }
                if (cost[i] > gas[i]) {
                    gascontained = 0;
                    index = i + 1;
                }
            }
            for (int i = 0; i < index; i++) {
                if (cost[i] < gas[i]) {
                    gascontained += cost[i] - gas[i];
                }
                if (cost[i] > gas[i]) {
                    gascontained = 0;
                    index = i + 1;
                }
            }
        }

    }
}
