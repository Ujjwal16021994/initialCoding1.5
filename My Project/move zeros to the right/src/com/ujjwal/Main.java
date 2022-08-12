package com.ujjwal;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {2,0,8,0,0,7};
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i< array.length;i++)
        {
            hmap.put(i,array[i]);
        }
        int j=0;
        int i=0;
        while (i<array.length)
        {
            if(hmap.get(i)!=0)
            {
                array[j++] = hmap.get(i);
            }
            i++;
        }
        while (j< array.length)
        {
            array[j++] = 0;
        }
        for(int f=0;f< array.length;f++)
        {
            System.out.print(array[f]+"  ");
        }
    }
}
