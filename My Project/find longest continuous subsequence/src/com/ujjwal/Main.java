package com.ujjwal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {5,6,4,10,3,9,1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< array.length;i++)
        {
            set.add(array[i]);
            if(array[i]<min)
            {
                min = array[i];
            }
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        int count = 0;
        int maxcount = 0;
        for(int j=min;j<=max;j++)
        {
            if(set.contains(j))
            {
                count++;
            }
            if(!set.contains(j))
            {
               if(maxcount<count)
               {
                   maxcount = count;
                   count = 0;
               }

            }
        }
        System.out.println(maxcount);
    }
}
