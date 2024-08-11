package org.example;

import org.example.sort.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Integer[] sorted = new ShellSort().sort(Sort.arr);
        System.out.println("-------------------");

        String arrS = Arrays.stream(sorted)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(arrS);
//        Arrays.stream(sorted).forEach(System.out::print);

    }
}