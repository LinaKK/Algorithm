package org.example.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DoSort {
    public Integer[] doSort(Sort algorithm, Integer[] arr){

        System.out.println("------------------------------");
        System.out.println(algorithm.getClass().getName());
        System.out.println();

        String arrS = Arrays.stream(arr)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(arrS);

        System.out.println("------------------------------");

        Integer[] sorted = algorithm.sort(arr);

        System.out.println("------------------------------");

        String sortedArrS = Arrays.stream(sorted)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(sortedArrS);

        return arr;
    }

}
