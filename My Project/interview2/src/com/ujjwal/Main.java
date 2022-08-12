package com.ujjwal;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] array = new int[] {5,8,6,4,2,6,5,8,7,8,1};
        int n = array.length;
        for(int i=1;i<n;i++)
        {
            int temp1 = array[i];
            int j=i-1;
            while(j>=0 && array[j]>temp1)
            {
                array[j+1] = array[j];
               j--;
            }
            j++;
            array[j] = temp1;
        }
        for (int k=0;k<n;k++)
        {
            System.out.print(array[k]+" ");
        }
    }
}
