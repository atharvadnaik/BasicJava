import java.util.Scanner;

public class BubbleSort {
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
        bubbleSort(list, noOfElements);
        printArray(list);
    }

    public static void bubbleSort(int[] list, int noOfElements) {
        for(int j = 0; j < noOfElements; j++) {
            for(int i = 0; i < noOfElements - j - 1 ; i++) {
                if(list[i+1] < list[i]) {
                    swapElements(list, i);
                }
            }
        }
    }

    public static void printArray(int[] list) {
        System.out.println("Sorted Array:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void swapElements(int[] list,int i) {
        //Swapping without using extra variable
        list[i] = list[i] + list[i+1];
        list[i+1] = list[i] - list[i+1];
        list[i] = list[i] - list[i+1];
    }
}