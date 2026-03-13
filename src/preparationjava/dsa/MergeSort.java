package preparationjava.dsa;

public class MergeSort {


    public static void main(String[] args) {
        int[] a = {8, 7, 4, 1};

        mergeSort(a);

        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+",");

    }

    public static void mergeSort(int[] a){

        if(a.length < 2){
            return;
        }

        int mid = a.length/2;
        int[] left = new int[mid];
        int[] right = new int[ a.length - mid];

        for(int i=0; i<mid; i++)
            left[i] = a[i];


        for(int i=mid; i<a.length; i++)
            right[i - mid] = a[i];


        mergeSort(left);
        mergeSort(right);

        merge(a, left, right);

    }

    public static void merge(int[] a, int[] left, int[] right){

        int start = 0;
        int end = 0; int index = 0;

        while(start < left.length && end < right.length ){
            if(left[start] <= right[end])
                a[index++] = left[start++];
            else
                a[index++] = right[end++];
        }

        while(start < left.length ){
            a[index++] = left[start++];
        }

        while(end < right.length){
            a[index++] = right[end++];
        }


    }



}
