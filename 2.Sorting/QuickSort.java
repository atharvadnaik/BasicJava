import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) {
        System.out.println("How many positive integers you want to enter?");
        Scanner elements = new Scanner(System.in);
        int noOfElements = elements.nextInt();
        int[] list = new int[noOfElements];
        System.out.println("Enter " + noOfElements + " elements");
        for (int i = 0; i < noOfElements; i++) {
            list[i] = elements.nextInt();
        }
        elements.close();
        quickSort(list, 0, list.length - 1);
        System.out.println("Sorted Array:\n");
        printArray(list);
    }

    public static int partition(int[] list, int start, int stop) {
        int pivot = list[stop];
        int i = start;
        for(int j = start; j < stop; j++) {
            if(list[j] <= pivot) {
                swapElements(list, i, j);
                i += 1;
            }
        }
        swapElements(list, i, stop);
        return i;
    }

    public static void quickSort(int[] list, int start, int stop) {
        if(start < stop) {
            int p = partition(list, start, stop);
            quickSort(list, start, p - 1);
            quickSort(list, p + 1, stop);
        }
    }

    public static void swapElements(int[] list, int i, int j) {
        int temp = list[j];
        list[j] = list[i];
        list[i] = temp;
    }


    public static void printArray(int[] list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}