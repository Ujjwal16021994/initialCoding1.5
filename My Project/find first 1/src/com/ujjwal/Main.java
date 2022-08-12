package com.ujjwal;

public class Main {

    public static int check(int[] array,int start,int end) {
        int mid = start + (end - start +1)/2;
        if(end-start==1)
        {
            if (array[start] == 1)
            {
                return start;
            }
            else if (array[end] == 1)
            {
                return end;
            }
            else
            {
                return -1;
            }
        }
            if(array[mid] == 0)
            {
                return check(array,mid,end);
            }
            if(array[mid] == 1)
            {
                return check(array,start,mid);
            }
            return 0;

        }

        public static void main(String[] args) {
            // write your code here
            int[] array = new int[] {1,1,1,1,1,1};
            int index = check(array,0,array.length-1);
            System.out.println(index);
        }
    }
