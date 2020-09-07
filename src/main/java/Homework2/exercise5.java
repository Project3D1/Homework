package Homework2;

import java.util.Arrays;

public class exercise5 {
    public static void main(String[] args) {
        int [] a = {1, 30, 20, 150, -70, 5};
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];}
            if (a[i] > max) {
                max = a[i]; }

    }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }
}
