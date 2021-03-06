import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = getArray();
        insertionSort(list, list.length);
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

    public static void insertionSort(int[] list, int noOfElements) {
        for(int j = 1; j < noOfElements; j++) {
            int i;
            int key;
            key = list[j];
            i = j - 1;
            while(i >= 0 && list[i] > key) {
                list[i+1] = list[i];
                i = i - 1;
            }
            list[i+1] = key;
        }
    }

    public static void printArray(int[] list) {
        System.out.println("Sorted Array:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}