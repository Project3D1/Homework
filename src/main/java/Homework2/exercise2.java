package Homework2;

public class exercise2 {
    public static void main(String[] args) {
        int[] a = new int[8];

        for( int i = 0, j = 0; i < a.length; i ++, j += 3) {
            a[i] = j;
            System.out.print(" " + j);
        }
    }
}
