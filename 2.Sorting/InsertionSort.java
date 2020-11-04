import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("How many elements you want to enter?");
        Scanner elements = new Scanner(System.in);
        int noOfElements = elements.nextInt();
        System.out.println("Enter " + noOfElements + " elements");
        int[] list = new int[noOfElements];
        for(int i = 0; i < noOfElements; i++) {
            list[i] = elements.nextInt();
        }
        elements.close();
        insertionSort(list, noOfElements);
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
        System.out.println("Sorted Array:");
        for(int i = 0; i < noOfElements; i++) {
            System.out.print(list[i] + " ");
        }
    }
}