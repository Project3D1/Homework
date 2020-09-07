package Homework2;

public class exercise4 {
    public static void main(String[] args) {
        int[][] table = new int[5][5];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++){
                if (i == j) {
                    table[i][j] = 1;
                }
                System.out.print(" " + table[i][j]);
            }
            System.out.println();
        }


    }
}
