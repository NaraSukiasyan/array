package com.company;

public class Main {

    public static void main(String[] args) {
	int nums []= {12,8,12,5,3};      //average value
    int result = 0;
    int i;
    for (i=0;i<5;i++)

         result = result+nums[i];

    System.out.println("average value" + result / 5);

    }
}
