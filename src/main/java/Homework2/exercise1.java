package Homework2;

import java.util.Arrays;

public class exercise1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) a[i] = 0;
            else a[i] = 1;
            System.out.print(" " + a[i]);}
    }
}
