package org.example.sort;

import java.util.Arrays;

public class BubbleSort implements Sort{

    @Override
    public Integer[] sort(Integer[] arr) {

        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println("---------------------");

        for(int i=arr.length-1; i>0; i--) {

            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1]) {
                    int box = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = box;
                }
            }
            Arrays.stream(arr).forEach(System.out::print);
            System.out.println();
        }

        return arr;
    }
}
