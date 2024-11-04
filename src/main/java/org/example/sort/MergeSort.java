package org.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort implements Sort{

//    ArrayList<Integer> tempArray = new ArrayList<>();

    Integer[] tempArray;
    @Override
    public Integer[] sort(Integer[] arr) {
        tempArray = new Integer[arr.length];
        mergeSort(arr, 0, arr.length-1);

        return arr;

    }

    private void mergeSort(Integer[] arr, int l, int r){
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            for(int i=l; i<=r; i++){
                tempArray[i] = arr[i];
            }


            System.out.print("temp: ");
            for(int i =l; i<=r; i++){
                System.out.print(tempArray[i]+",");
            }System.out.println();


            int lIdx = l;
            int rIdx = mid+1;
            int arrIdx = l;

            while(lIdx<=mid && rIdx<=r){
                if(tempArray[lIdx] < tempArray[rIdx]){
                    arr[arrIdx] = tempArray[lIdx];
                    lIdx++;
                }
                else {
                    arr[arrIdx] = tempArray[rIdx];
                    rIdx++;
                }
                arrIdx++;
            }

            while(lIdx <= mid){
                arr[arrIdx++] = tempArray[lIdx++];
            }
            while(rIdx <= r){
                arr[arrIdx++] = tempArray[rIdx++];
            }


            System.out.print("sortTemp: ");
            for(int i =l; i<=r; i++){
                System.out.print(arr[i]+",");
            }System.out.println();


            String arrS = Arrays.stream(arr)
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.println(arrS);

            System.out.println("======================");

        }

    }

}
