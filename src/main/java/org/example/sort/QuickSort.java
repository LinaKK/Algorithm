package org.example.sort;

public class QuickSort implements Sort{

    @Override
    public Integer[] sort(Integer[] arr) {

        return quickSort(arr, 0, arr.length-1);
    }



    private Integer[] quickSort(Integer[] arr, int l, int r) {
        if(l < r){
            int i = medianOfThreePartitioning(arr, l, r);

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

            while(arr[lIdx] < v && lIdx < r) lIdx++;
            while(arr[rIdx] > v && rIdx > l) rIdx--;

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


    private int medianOfThreePartitioning(Integer[] arr, int l, int r){
        int mid = (l+r)/2;
        if(arr[l] > arr[mid]){
            int temp = arr[l];
            arr[l] = arr[mid];
            arr[mid] = temp;
        }
        if(arr[l] > arr[r]){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        if(arr[mid] > arr[r]){
            int temp = arr[mid];
            arr[mid] = arr[r];
            arr[r] = temp;
        }
        int temp = arr[mid];
        arr[mid] = arr[r-1];
        arr[r-1] = temp;

        System.out.print("median of three partitioning: ");
        for(int n : arr){
            System.out.print(n);
        }
        System.out.println();


        //arr[l+1]~arr[r-1]
        int lidx = l+1;
        int rIdx = r-2;
        int v = arr[r-1];

        while(true){
            if((arr[lidx] < v) && (lidx < (r-1))) lidx++;
            if((arr[rIdx] > v) && (rIdx > (l+1))) rIdx--;

            if(lidx >= rIdx) break;

            temp = arr[lidx];
            arr[lidx] = arr[rIdx];
            arr[rIdx] = temp;

            lidx++;
            rIdx--;
        }

        arr[r-1] = arr[lidx];
        arr[lidx] = v;


        for(int n : arr){
            System.out.print(n);
        }
        System.out.println();
        return lidx;

    }
}
