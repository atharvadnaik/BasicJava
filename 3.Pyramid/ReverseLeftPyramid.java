import java.util.Scanner;
public class ReverseLeftPyramid {
    public static void main(String[] args) {
        System.out.println("How Many lines you want?");
        Scanner lines = new Scanner(System.in);
        int noOfLines = lines.nextInt();
        for(int i = 0; i < noOfLines; i++){
            for(int j = noOfLines; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        lines.close();
    }
}