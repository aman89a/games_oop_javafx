package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        boolean verRsl = true;
        boolean gorRsl = true;
        int temp = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 1) {
                    for (int k = 0; k < board.length; k++){
                        if (board[k][j] != 1){
                            verRsl = false;
                            break;
                        }
                    }
                    for (int k = 0; k < board[i].length; k++){
                        if (board[i][k] != 1){
                            gorRsl = false;
                            break;
                        }
                    }
                    if (verRsl) {
                        rsl = verRsl;
                    } else if (gorRsl) {
                        rsl = gorRsl;
                    } else {
                        rsl = false;
                    }

                }
            }
        }
        return rsl;
    }
}
