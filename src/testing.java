import java.util.InputMismatchException;
import java.util.Scanner;
public class testing {
    public static void main(String[] args) {
        int xCoordinate = 0, yCoordinate = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter Player 1");
                System.out.println("Enter x Coordinate : ");
                xCoordinate = sc.nextInt();
                System.out.println("Enter y Coordinate : ");
                yCoordinate = sc.nextInt();
                if (xCoordinate > 3 || xCoordinate < 1 || yCoordinate < 1 || yCoordinate > 3) {
                    System.out.println("Number Should be between 1-3");
                    System.out.println("Enter Player 1");
                    System.out.println("Enter x Coordinate : ");
                    xCoordinate = sc.nextInt();
                    System.out.println("Enter y Coordinate : ");
                    yCoordinate = sc.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("Entered Coordinates should be " +
                        "number between 1-3");
//                            flag = 1;
            }
            sc.nextLine();
        } while (xCoordinate < 1 || xCoordinate > 3 || yCoordinate < 1 || yCoordinate > 3);
    }

}
