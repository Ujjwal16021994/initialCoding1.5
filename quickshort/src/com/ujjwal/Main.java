
package com.ujjwal;

import java.util.HashSet;

public class Main {
    public static HashSet<Integer> Haset(){
        HashSet<Integer> Haset = new HashSet<Integer>();
        Haset.add(1);
        Haset.add(12);
        Haset.add(43);
        for(int ele : Haset)
            System.out.print(ele+" ioioi ");
        return Haset;

    }
    public static void main(String[] args) {
        HashSet<Integer> Haset = new HashSet<>();
        Haset = Haset();
        System.out.print(Haset);

            }
        }