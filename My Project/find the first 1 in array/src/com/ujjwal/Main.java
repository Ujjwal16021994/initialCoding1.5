package com.ujjwal;

public class Main {


    public static void main(String[] args) {
	// write your code here
        int[] array1 = new int[] {2,3,4};
        int[] array2 = new int[] {1,5,8};
        int n1 = array1.length;
        int n2 = array2.length;
        int[] array3 = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(array1[i]<=array2[j])
            {
                array3[k++] = array1[i++];
            }
            else
            {
                array3[k++] = array2[j++];
            }
        }
        while(i<n1)
        {
            array3[k++] = array1[i++];
        }
        while (j<n2)
        {
            array3[k++] = array2[j++];
        }
        for (int a=0;a<n1+n2;a++)
        {
            System.out.print(array3[a]+"  ");
        }

    }
}
