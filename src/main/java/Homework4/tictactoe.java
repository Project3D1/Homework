package Homework4;

import java.util.Random;
import java.util.Scanner;

public class tictactoe {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            } while (!isCellValid(x,y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return  true;
        return false;
    }
    public static Random random = new Random();
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static boolean checkWin0(char symb) {
        int coordinateX = 0;
        int coordinateY = 0;
        int diagonalX = 0;
        int diagonalY = 0;

        for (int i = 0; i <= SIZE - 1; i++) {
            for (int j = 0; j <= SIZE - 1; j++) {
                if (map[i][j] == symb) {
                    coordinateX++;
                    if (coordinateX == SIZE) return true;
                }
                if (map[j][i] == symb) {
                    coordinateY++;
                    if (coordinateY == SIZE) return true;
                }
            }
            if (map[i][i] == symb) {
                diagonalX++;
                if (diagonalX == SIZE) return true;
            } else diagonalX = 0;

            if (map[i][SIZE - 1 - i] == symb) {
                diagonalY++;
                if (diagonalY == SIZE) return true;
            } else diagonalY = 0;
        }
        return false;
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin0(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin0(DOT_O)) {
                System.out.println("Победил Искуственный интелект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println();
        System.out.println("Игра закончена");
    }

}
