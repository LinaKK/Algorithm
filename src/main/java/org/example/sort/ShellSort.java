package org.example.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShellSort implements Sort{

    @Override
    public Integer[] sort(Integer[] arr) {
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

            String arrS = Arrays.stream(arr)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));

            System.out.println(arrS);
        }

        return arr;
    }
}
