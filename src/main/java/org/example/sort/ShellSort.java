package org.example.sort;

import java.util.Arrays;

public class ShellSort implements Sort{

    @Override
    public Integer[] sort(Integer[] arr) {
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println("--------------------");

        int h=1;
        while(h<arr.length){
            h *=3+1;
        }

        for(; h>0; h/=3){
            for(int i=h; i<arr.length; i++){
                int v = arr[i];
                int j = i;
                while(j>=h && arr[j-h]>v){
                    arr[j] = arr[j-h];
                    j -= h;
                }
                arr[j] = v;
            }

            Arrays.stream(arr).forEach(System.out::print);
            System.out.println();
        }

        return arr;
    }
}
