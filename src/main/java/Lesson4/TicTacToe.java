package Lesson4;

import java.util.Arrays;

public class TicTacToe {
    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';

    private static char[][] map;
    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;



    public static void main(String[] args) {
        iniMap();
        printMap();
    }

    private static void printMap() {

    }

    private static void iniMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }
}
