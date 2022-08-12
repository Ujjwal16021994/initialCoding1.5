package com.ujjwal;

public class Main {
    public static int pivot(int[] array,int start,int end) {
      int pivot = array[end];
      int i = start - 1;
      for(int j=start;j<end;j++)
      {
          if(array[j]<pivot)
          {
              i++;
              int temp = array[i];
              array[i] = array[j];
              array[j] = temp;
          }
      }
      i++;
      int temp = array[i];
      array[i] = array[end];
      array[end] = temp;
      return i;
    }
    public static void quicksort(int[] array,int start,int end) {
        if(start>=end)
        {
            return;
        }
        int pindex = pivot(array,start,end);
        quicksort(array,start,pindex-1);
        quicksort(array,pindex+1,end);
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[]{1,6,8,7,5,2,5,87,74};
        quicksort(array,0,array.length-1);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
