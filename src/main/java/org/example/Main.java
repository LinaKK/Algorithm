package org.example;

import org.example.sort.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        DoSort ds = new DoSort();
        ds.doSort(new QuickSort(), Sort.arr);


    }
}