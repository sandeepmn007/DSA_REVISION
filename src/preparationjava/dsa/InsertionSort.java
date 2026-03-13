package preparationjava.dsa;

public class InsertionSort {

    public static void main(String[] args) {

        int[] a = {5,6,4,9,2};

        insertionSort(a);

        for(int i : a) System.out.print(i+",");

    }

    private static void insertionSort(int[] a) {

        for(int i=1; i<a.length; i++){

            int ele = a[i];
            int j = i-1;

            while(j>=0 && a[j] > ele){

                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;

                j--;
            }

        }

    }


}
