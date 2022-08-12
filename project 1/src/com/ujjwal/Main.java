package com.ujjwal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int firstnumber , secondnumber , thirdnumber , product = 1;
        Scanner sc = new Scanner(System.in);
        firstnumber = sc.nextInt();
        secondnumber = sc.nextInt();
        thirdnumber = sc.nextInt();
        product = firstnumber * secondnumber * thirdnumber;
        System.out.println("the product of three numbers is = "+product);
        //variables
    }
}
