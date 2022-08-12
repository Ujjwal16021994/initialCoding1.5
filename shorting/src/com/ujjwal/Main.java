    package com.ujjwal;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            int[] c = new int[m + n];
            int i = 0, j = 0, k = 0;
            int p = m+n;
            while (k<p) {
                if (a[i] < b[j]) {
                    c[k] = a[i];
                    i++;
                    k++;
                }
                if (a[i] > b[j]) {
                    c[k] = b[j];
                    j++;
                    k++;
                }

                System.out.println(c[k]);
            }
        }
    }