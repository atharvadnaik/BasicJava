import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("How Many elements you want? ");
        Scanner elements = new Scanner(System.in);
        int noOfElements = elements.nextInt();
        int[] list = new int[noOfElements];
        System.out.println("Enter " + noOfElements + " elements in ascending order.");
        for(int i = 0; i < noOfElements; i++){
            list[i] = elements.nextInt();
        }
        System.out.println("Which element you want to search? ");
        int toBeSearched = elements.nextInt();
        elements.close();
        int location = binarySearch(list, toBeSearched);
        printLocation(location);
    }

    public static int binarySearch(int[] list, int toBeSearched) {
        int mid;
        int lowerBound = 0;
        int upperBound = list.length - 1;
        int location = -1;
        while(lowerBound <= upperBound) {
            mid = (lowerBound + upperBound)/2;
            if(list[mid] == toBeSearched) {
                location = mid;
            }
            if(list[mid] < toBeSearched){
                lowerBound = mid + 1;
            }
            else {
                upperBound = mid - 1;
            }
        }
        return location + 1;
    }

    public static void printLocation(int location) {
        if(location == 0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at location: " + location);
        }
    }
}