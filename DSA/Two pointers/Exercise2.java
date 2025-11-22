package com.togudv;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        removeDuplicates(arr);
    }


    public static int removeDuplicates(int[] nums) {

        if(nums.length < 3) {
            if(nums.length == 1) {
                return 1;
            }

            else if (nums[0] == nums[1])
                return 1;

            return 2;
        }

        int pointer1 = 0;
        int pointer2 = 1;

        while(pointer2 <= nums.length - 1 && pointer1 < pointer2) {
            if(nums[pointer1] == nums[pointer2]) {
                pointer2++;
            }

            else {
                nums[pointer1+1] = nums[pointer2];
                pointer1++;
                pointer2++;
            }

        }

        return pointer1+1;
    }
}