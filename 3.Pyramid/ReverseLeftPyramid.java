import java.util.Scanner;
public class ReverseLeftPyramid {
    public static void main(String[] args) {
        System.out.println("How Many lines you want?");
        Scanner lines = new Scanner(System.in);
        int noOfLines = lines.nextInt();
        for(int i = noOfLines; i > 0; i--){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int j = noOfLines + 1; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        lines.close();
    }
}