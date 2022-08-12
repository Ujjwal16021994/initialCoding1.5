package com.ujjwal;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {8,4,6,1,3,6,4,3,5,4,4,4,4,4,3,6,2,4,6,7,6,2,3,4,6,6,7,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = array.length;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(array[i]))
            {
                map.put(array[i],map.get(array[i])+1);
            }
            else
            {
                map.put(array[i],1);
            }
        }
        for(int ele : map.keySet())
        {
            System.out.println(ele+"  "+map.get(ele));
        }
        System.out.println();
        int max = 0;
        int index =0;
        int result1 =0;
        for(int i : map.keySet())
        {
            if(map.get(i)>max)
            {
                max = map.get(i);
                index = i;
                result1 = i;
            }
            else if(map.get(i) == max)
            {
                if(i>index)
                {
                    result1 = i;
                }
                else
                {
                    result1 = index;
                }
            }
        }
        System.out.println(result1);
    }
}
