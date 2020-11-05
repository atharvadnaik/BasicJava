import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("How Many elements you want? ");
        Scanner elements = new Scanner(System.in);
        int noOfElements = elements.nextInt();
        int[] list = new int[noOfElements];
        System.out.println("Enter " + noOfElements + " elements.");
        for(int i = 0; i < noOfElements; i++){
            list[i] = elements.nextInt();
        }
        System.out.println("Which element you want to search? ");
        int toBeSearched = elements.nextInt();
        elements.close();
        int location = linearSearch(list, toBeSearched);
        if(location == 0){
            System.out.println("Element not found");
        }
        else{ 
            System.out.println("Element found at location: " + location);
        }
    }

    public static int linearSearch(int[] list, int toBeSearched) {
        int location = -1;
        for(int i = 0; i < list.length; i++){
            if(list[i] == toBeSearched) {
                location = i;
            }
        }
        return location + 1;
    }
}