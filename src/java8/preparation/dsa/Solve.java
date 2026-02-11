package java8.preparation.dsa;

public class Solve {

    public static void main(String[] args) {

        int[] a = {2,4,6,8,10};

        int[] b = {1,3, 5, 7};

        int[] ans = mergeSortedArray(a, b);

        for(int i=0; i<ans.length; i++)
            System.out.print(ans[i]);


    }

    private static int[] mergeSortedArray(int[] a, int[] b) {

        int[] ans = new int[a.length + b.length];
        int x = 0; int y =0; int index = 0;

        while(x < a.length && y < b.length){
            if(a[x] <= b[y]){
                ans[index++] = a[x++];
            } else{
                ans[index++] = b[y++];
            }
        }

        while(x < a.length){
            ans[index++] = a[x++];
        }

        while(y < b.length){
            ans[index++] = b[y++];
        }

        return ans;

    }

}
