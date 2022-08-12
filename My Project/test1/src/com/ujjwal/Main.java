package com.ujjwal;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int[] array = new int[]{0,4,5,2,7,9,3,-2};
      int n= array.length;
      int target = 7;
        HashSet<Integer> has = new HashSet<>();
      for(int i=0;i<n;i++)
      {
          has.add(array[i]);
      }
      for(int i=0;i<n;i++)
      {
          if(has.contains(target-array[i]))
          {

              System.out.println(array[i]+" "+(target-array[i]));
              has.remove(array[i]);
              has.remove(target-array[i]);
          }
      }

    }
    }