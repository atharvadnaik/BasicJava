import java.util.Scanner;

public class LeftPyramid {
    public static void main(String[] args) {
        System.out.println("How Many lines you want?");
        Scanner lines = new Scanner(System.in);
        int noOfLines = lines.nextInt();
        lines.close();
        printPyramid(noOfLines);
    }

    public static void printPyramid(int noOfLines) {
        for(int i = 0; i < noOfLines; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}