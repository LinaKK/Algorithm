package org.example.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectionSort implements Sort {
    int minIdx;
    @Override
    public Integer[] sort(Integer[] arr) {

        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println("------------------------------");

        for(int i=0; i<arr.length-1; i++) {
            minIdx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int min = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = min;

            String arrS = Arrays.stream(arr)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));

            System.out.println(arrS);
        }

        return arr;
    }
}
