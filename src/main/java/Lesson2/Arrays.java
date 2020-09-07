package Lesson2;

public class Arrays {
    public static void main(String[] args) {
//        int[] a = new int[5];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;

//        int[] a = new int [] {1,2,3,4,5};

        int[] a = {1,2,3,4,5};

        for (int i = 0; i < a.length / 2; i++) {
            System.out.println(a[i]);
        }

        for (int value : a) {
            System.out.println(value);

        }

        System.out.println("---------");


//        int[][] table = new int[3][];
        int[][] table = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
//        table[0] = new int[] {1, 2};
//        table[1] = new int[] {4, 5, 6};
//        table[2] = new int[] {7, 8, 9, 10};

        for (int[] row : table) {
            for (int value : row) {
                System.out.print(" " + value);
            }
            System.out.println();

        }
    }
}
