package com.togudv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int target = 0;
        List<Integer> nums = new ArrayList<>(List.of(-1,1,2,3,1));



        System.out.println("Please insert the target");

        Scanner scanner = new Scanner(System.in);

        target = scanner.nextInt();

        System.out.println("Result: "+countPairs(nums, target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int pairs = 0;
        int pointer1 = 0;
        int pointer2 = nums.size() - 1;

        Collections.sort(nums);

        while(pointer1 < pointer2) {
            if(nums.get(pointer1) + nums.get(pointer2) < target ) {
                pairs+= pointer2 - pointer1;
                pointer1++;
            }

            else {
                pointer2--;
            }
        }

        return pairs;
    }
}