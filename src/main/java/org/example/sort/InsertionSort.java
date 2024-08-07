package org.example.sort;

import java.util.Arrays;

public class InsertionSort {

    public Integer[] sort(Integer[] arr){

        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        System.out.println("-----------------------------");

        for(int i=1; i<arr.length; i++){
            int v = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > v) { //arr[j] > v && j>=0 -> j==-1이 되었을 때 'arr[j]' > v 에서 걸림_index -1 out of bounds for length 10
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = v;

            Arrays.stream(arr).forEach(System.out::print);
            System.out.println();
        }

//        int v = 0;
//
//        for(int i=1; i<arr.length; i++){
//            v = arr[i];
//            int j = 0;
//
//            while(j < i){
//                if(arr[j] > v){
//                    for(int k = i-1; k >= j; k--){
//                        arr[k+1] = arr[k];
//                    }
//                    arr[j] = v;
//                    break;
//                }
//                j++;
//            }
//            Arrays.stream(arr).forEach(System.out::print);
//            System.out.println();
//        }

        return arr;
    }

}
