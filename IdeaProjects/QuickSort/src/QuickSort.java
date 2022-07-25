public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) return;

        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = { 55, 1, -4, 7, 93, 37, 0, 12 };
        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }

    }
}