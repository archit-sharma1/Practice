package Algorithms;

public class QuickSort {
    public QuickSort(String string){
        char[] chars = string.toCharArray();
        int n = chars.length;
        quickSort(chars,0,n-1);
        printArr(chars);
    }
    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(char[] arr, int low, int high){
        // Choosing the pivot
        char pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot ) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public void quickSort(char[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static String printArr(char[] arr) {
        String finalString = "";
        for (char c : arr) {
            finalString = finalString + c;
            System.out.print(c);
        }
        System.out.println();
        return finalString;
    }
}
