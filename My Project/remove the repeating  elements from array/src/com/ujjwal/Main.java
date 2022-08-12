package com.ujjwal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[]{1,1,2,3,5,6,6,6,7,8,4,5,6,4};
        int[] array1 = new int[array.length];
        array1[0] = array[0];
        int m=1;
        for(int i=1;i< array.length;i++)
        {
            int count =0;
            int j;
            for(j=0;j< i;j++)
            {
                if(array[i] == array[j])
                    count++;
            }
            if(count==0)
            {
                array1[m++] = array[i];
            }

        }
        for(int k=0;k< array.length;k++)
        {
            System.out.print(array1[k]+" ");
        }
    }
}
