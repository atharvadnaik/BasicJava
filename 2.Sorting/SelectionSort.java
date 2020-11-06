import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = getArray();
        selectionSort(list);
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

    public static void selectionSort(int[] list) {
        int length = list.length;
        for(int i = 0; i < length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < length; j++){
                if(list[j] < list[min]) {
                    swapElements(list, j, min);
                }
            }
        }
    }

    public static void swapElements(int[] list, int i, int j) {
        int temp = list[j];
        list[j] = list[i];
        list[i] = temp;
    }

    public static void printArray(int[] list) {
        System.out.println("Sorted Array:");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
