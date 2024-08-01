package org.example;

import org.example.sort.SelectionSort;
import org.example.sort.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] sorted = new SelectionSort().sort(Sort.arr);
        System.out.println("-------------------");
        Arrays.stream(sorted).forEach(System.out::print);

    }
}