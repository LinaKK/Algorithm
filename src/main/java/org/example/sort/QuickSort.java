package org.example.sort;

public class QuickSort implements Sort{

    @Override
    public Integer[] sort(Integer[] arr) {

        return quickSort(arr, 0, arr.length-1);
    }



    private Integer[] quickSort(Integer[] arr, int l, int r) {
        if(l < r){
            int i = partition(arr, l, r);

            quickSort(arr, l, i-1);
            quickSort(arr, i+1, r);
        }

        return arr;
    }

    private int partition(Integer[] arr, int l, int r){
        int v = arr[r]; System.out.print("l: "+l + ", "+ "r: "+r + " ->   ");
        int lIdx = l;
        int rIdx = r-1;

        while(true){
            while((lIdx < r) && (arr[lIdx] < v)) lIdx++;
            while((rIdx > l) && (arr[rIdx] > v)) rIdx--;

            if(lIdx >= rIdx) break;

            int temp = arr[lIdx];
            arr[lIdx] = arr[rIdx];
            arr[rIdx] = temp;

            lIdx++;
            rIdx--;
        }

        arr[r] = arr[lIdx];
        arr[lIdx] = v;


        for(int n : arr){
            System.out.print(n);
        }
        System.out.println();


        return lIdx;
    }



//    private int partition(Integer[] arr, int l, int r){
//
//        int v = arr[r];
//        int lIdx = l;
//        int rIdx = r-1;
//
//        while(true) {
//            while(arr[lIdx] < v && lIdx < rIdx) lIdx++;
//            while(arr[rIdx] > v && rIdx > lIdx) rIdx--;
//
//            if(lIdx >= rIdx) break;
//
//            int temp = arr[lIdx];
//            arr[lIdx] = arr[rIdx];
//            arr[rIdx] = temp;
//
//            lIdx++;
//            rIdx--;
//        }
//
//        arr[r] = arr[lIdx];
//        arr[lIdx] = v;
//
//        return lIdx;
//    }
}
