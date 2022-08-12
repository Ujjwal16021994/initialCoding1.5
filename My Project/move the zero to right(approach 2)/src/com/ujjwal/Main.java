package com.ujjwal;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2,0,8,9,0,0,0,0,4,5,0};
        int n = array.length;
        int i=0,j=n-1;
            while(i==j)
            {
             if(array[i]!=0)
             {
                 i++;
             }
             if(array[j]==0)
             {
                 j--;
             }
             if(array[j]!=0 && array[i]==0)
             {
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
                 i++;
                 j--;
             }
            }
        for(int l=0;l<n;l++)
        {
            System.out.print(array[l]);
        }
    }
}


