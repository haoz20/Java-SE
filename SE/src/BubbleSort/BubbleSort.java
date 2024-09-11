package BubbleSort;

public class BubbleSort {
    static int[] arr = {4, 10, 2, 3, 9, 7, 1};
    static int steps = arr.length-1;

    public void swap(int n) {
        if (n == arr.length) {
            return;
        } else {

        }
    }

    public void bubbleSort(int step) {
        if (step == 1) {
            return;
        } else {
            swap(step);
        }
    }

    public static void main(String[] args) {
        bubbleSort(steps);


    }


}
