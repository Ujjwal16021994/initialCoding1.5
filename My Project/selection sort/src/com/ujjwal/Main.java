package com.ujjwal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {5,9,6,7,5,6,2,6,7,5};
        int n = array.length;
        for(int i=0;i<n;i++)
        {
            int smallest = array[i];
            int index = i;
            {
                for(int j=i+1;j<n;j++)
                {
                    if(array[j]<smallest)
                    {
                        smallest = array[j];
                        index = j;
                    }
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+"  ");
        }
    }
}
