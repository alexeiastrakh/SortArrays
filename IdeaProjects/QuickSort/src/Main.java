public class Main {

    public static void main(String[] args) {
        int[] x = { -2, -3, 10, -10, 4, -5, -1, 6, -2, -4, 7, 8, 2, -8 };
        QuickSort.sort(x);
        for(int i=0;i<x.length;i++) {
            System.out.println(x[i]);
        }

    }
}
