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
    }

    public static void bubbleSort(int[] list, int noOfElements) {
        for(int j = 0; j < noOfElements; j++) {
            for(int i = 0; i < noOfElements - j - 1 ; i++) {
                if(list[i+1] < list[i]) {
                    list[i] = list[i] + list[i+1];
                    list[i+1] = list[i] - list[i+1];
                    list[i] = list[i] - list[i+1];
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < noOfElements; i++) {
            System.out.print(list[i] + " ");
        }
    }
}