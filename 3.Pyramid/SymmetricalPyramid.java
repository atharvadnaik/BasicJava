import java.util.Scanner;
public class SymmetricalPyramid {
    public static void main(String[] args) {
        System.out.println("How Many lines you want?");
        Scanner lines = new Scanner(System.in);
        int noOfLines = lines.nextInt();
        for(int i = 1; i <= noOfLines; i++){
            for(int j = noOfLines; j > i; j--){
                System.out.print(" ");
                }
            for(int k = 0; k < i; k++){
                    System.out.print("* ");
            }
            System.out.println();
        }
        lines.close();
    }
}