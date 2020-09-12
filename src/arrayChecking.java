public class arrayChecking {
    public static int checkArray(char[][] array){
        int i, j = 0, xRowFlag = 0, xColumnFlag = 0, xDiagonalFlag = 0, oRowFlag
                = 0, oColumnFlag = 0, oDiagonalFlag = 0, emptySpace = 0,
                XCount  = 0, OCount = 0;
        for (i = 0 ; i < 3; i++) {
            if ((array[i][j] == 'X') && (array[i][j] == array[i][j+1]) && (array[i][j+1] == array[i][j+2]))
                xRowFlag = 1;
            if ((array[i][j] == 'O') && (array[i][j] == array[i][j+1]) && (array[i][j+1] == array[i][j+2]))
                oRowFlag = 1;
            if ((array[j][i] == 'X') && (array[j][i] == array[j+1][i]) && (array[j+1][i] == array[j+2][i]))
                xColumnFlag = 1;
            if ((array[j][i] == 'O') && (array[j][i] == array[j+1][i]) && (array[j+1][i] == array[j+2][i]))
                oColumnFlag = 1;
        }
        if (((array[0][0] == 'X') && (array[0][0] == array[1][1]) && (array[1][1] == array[2][2])) || (array[2][0] == 'X') && (array[2][0] == array[1][1]) && (array[1][1] == array[0][2]))
            xDiagonalFlag = 1;
        if (((array[0][0] == 'O') && (array[0][0] == array[1][1]) && (array[1][1] == array[2][2])) || (array[2][0] == 'O') && (array[2][0] == array[1][1]) && (array[1][1] == array[0][2]))
            oDiagonalFlag = 1;
        for (i = 0 ; i < 3; i++) {
            for( j = 0; j < 3; j++) {
                if(array[i][j] == ' ' || array[i][j] == '_') {
                    emptySpace++;
                }
                else if (array[i][j] == 'X')
                    XCount++;
                else if (array[i][j] == 'O')
                    OCount++;
            }
        }
        System.out.println(xRowFlag);
        System.out.println(xColumnFlag);
        System.out.println(xDiagonalFlag);
        System.out.println(oRowFlag);
        System.out.println(oColumnFlag);
        System.out.println(oDiagonalFlag);

        //conditions
        if (xRowFlag == 1 || xColumnFlag == 1 || xDiagonalFlag == 1)
            return 1; //for x Wins
        else if (oRowFlag == 1 || oColumnFlag == 1 || oDiagonalFlag == 1)
            return 2; // for o wins
        else
            return 0; // for draw case

    }
}
