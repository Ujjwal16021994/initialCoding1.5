package com.ujjwal;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {2,5,4,5,7,8,4,5,45,5,6,5,4,5,};
        int k = 4;
        for(int i=0;i< array.length;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(array[j+1]<array[j])
                {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        int index = array.length - k + 1;
        System.out.println(array[index]);
    }
}
