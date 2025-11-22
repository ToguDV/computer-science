package com.togudv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,65,73};

        System.out.println("Ingrese el target de la suma");
        int target = scanner.nextInt();

        sumTarget(arr, target);
    }


    public static void sumTarget(int[] arr, int target ) {
        int pointer1 = 0;
        int pointer2 = arr.length - 1;

        while(pointer1 < pointer2) {

            int sum = arr[pointer1] + arr[pointer2];

            if(target > sum ) {
                pointer1++;
            }

            else if(target < sum) {
                pointer2--;
            }

            else {
                System.out.println("["+pointer1+ ", "+ pointer2+"]");
                return;
            }


        }

        System.out.println("No se pudo lograr la suma target");

    }
}
