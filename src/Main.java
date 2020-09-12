import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        arrayChecking obj = new arrayChecking();
        char[][] array = new char[3][3];
        int i,j,xCoordinate = 0, yCoordinate = 0,result = 0;
        Scanner sc = new Scanner(System.in);
        int x,y,count = 0, xRowFlag = 0, xColumnFlag = 0, xDiagonalFlag = 0,
                oRowFlag
                = 0, oColumnFlag = 0, oDiagonalFlag = 0, emptySpace = 0,
                XCount  = 0, OCount = 0;

        for (i = 0; i < 3; i++) { //looping through all the nine cells
            for (j = 0; j < 3; j++) {
                if (count % 2 == 0) { //Player 1 playing the game
                    xCoordinate = 0;
                    yCoordinate = 0;
                    do {
                        try {
//                            System.out.println("i m in try");
                            System.out.println("Enter Player 1");
                            System.out.println("Enter x Coordinate : ");
                            xCoordinate = sc.nextInt();
                            System.out.println("Enter y Coordinate : ");
                            yCoordinate = sc.nextInt();
                            if (xCoordinate > 3 || xCoordinate < 1 || yCoordinate < 1 || yCoordinate > 3) {
                                System.out.println("Number Should be between 1-3");
                            } else if (array[xCoordinate - 1][yCoordinate - 1] != '\0') {
                                System.out.println("Field is occupied!");
                                xCoordinate = 0;
                                yCoordinate = 0;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entered Coordinates should be " +
                                    "number between 1-3");
                        }
//                        System.out.println("xCoordinate of player 1 is " + xCoordinate);
//                        System.out.println("yCoordinate of player 1 is " + yCoordinate);
                        sc.nextLine(); // clearing the buffer
                    } while (xCoordinate < 1 || xCoordinate > 3 || yCoordinate < 1 || yCoordinate > 3);
                    array[xCoordinate - 1][yCoordinate - 1] = 'X';
                    count++;
                } else {  //Player 2 playing the game
                    xCoordinate = 0;
                    yCoordinate = 0;
                    do {
                        try {
                            System.out.println("Enter Player 2");
                            System.out.println("Enter x Coordinate : ");
                            xCoordinate = sc.nextInt();
                            System.out.println("Enter y Coordinate : ");
                            yCoordinate = sc.nextInt();
                            if (xCoordinate > 3 || xCoordinate < 1 || yCoordinate < 1 || yCoordinate > 3) {
                                System.out.println("Number Should be between 1-3");
                            } else if (array[xCoordinate - 1][yCoordinate - 1] != '\0') {
                                System.out.println("Field is occupied!");
                                xCoordinate = 0;
                                yCoordinate = 0;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entered Coordinates should be " +
                                    "number between 1-3");
                        }
//                        System.out.println("xCoordinate of player 2 is " + xCoordinate);
//                        System.out.println("yCoordinate of player 2 is " + yCoordinate);
                        sc.nextLine(); // clearing the buffer
                    } while (xCoordinate < 1 || xCoordinate > 3 || yCoordinate < 1 || yCoordinate > 3);
                    array[xCoordinate - 1][yCoordinate - 1] = 'O';
                    count++;
                }
                for (x = 0; x < 3; x++) {
                    for (y = 0; y < 3; y++) {
                        System.out.print(array[x][y] + " ");
                    }
                    System.out.println();
                }
                result = obj.checkArray(array);
//                System.out.println("result = " + result);// checking for
                if(result == 1 || result == 2)
                    break;
                // conditions
            }
            if(result == 1) {
                System.out.println("X Wins");
                break;
            } else if (result == 2){
                System.out.println("O Wins");
                break;
            }
        }
        if(result == 0) {
            System.out.println("Draw");
        }
    }
}
