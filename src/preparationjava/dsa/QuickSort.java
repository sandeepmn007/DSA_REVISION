package preparationjava.dsa;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] a = {8,3,6,1,5,9,4};
        quickSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));

    }

    private static void quickSort(int[] a, int start, int end) {
        if(start < end){
            int pivot = partition(a, start , end);
            quickSort(a, start , pivot);
            quickSort(a, pivot +1 ,end);
        }
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end-1];
        int i = start -1;
        for(int j = start; j<end; j++){
            if(a[j] < pivot) {
                i++;
                swap(a,j,i);
            }

        }
         swap(a, end-1, i+1);
        return i+1;
    }

    private static void swap(int[] a,int source, int destination ){
        int temp = a[destination];
        a[destination] = a[source];
        a[source] = temp;
    }

}
