import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int[] list = getArray();
        mergeSort(list);
        printArray(list);
    }

    public static int[] getArray() {
        System.out.println("How many elements you want to enter?");
        Scanner elements = new Scanner(System.in);
        int noOfElements = elements.nextInt();
        int[] list = new int[noOfElements];
        System.out.println("Enter " + noOfElements + " integers");
        for (int i = 0; i < noOfElements; i++) {
            list[i] = elements.nextInt();
        }
        elements.close();
        return list;
    }

    public static void mergeSort(int[] list) {
        int size = list.length;
        if (size < 2) {
            return;
        }
        int mid = size/2;
        int rightSize = size - mid;
        int[] left = new int[mid];
        int[] right = new int[rightSize];
        System.arraycopy(list, 0, left, 0, mid);
        if (size - mid >= 0) System.arraycopy(list, mid, right, 0, size - mid);
        mergeSort(left);
        mergeSort(right);
        merge(list, left, right);
    }

    public static void merge(int[] list, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0;
        int j = 0;
        int pointer = 0;
        while(i < leftSize && j < rightSize) {
            if(left[i] <= right[j]) {
                list[pointer] = left[i];
                i++;
            }
            else{
                list[pointer] = right[j];
                j++;
            }
            pointer++;
        }
        while(i < leftSize) {
            list[pointer] = left[i];
            i++;
            pointer++;
        }
        while(j < rightSize) {
            list[pointer] = right[j];
            j++;
            pointer++;
        }
    }

    public static void printArray(int[] list) {
        System.out.println("Sorted Array:");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}