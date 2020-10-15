package Homework2_2;

import Homework2_2.Exception.MySizeArrayException;
import Homework2_2.Exception.MyArrayDataException;

import java.util.Arrays;

public class ArrayException {
    final static int VALID_ARRAY_SIZE = 4;

    public static void main(String[] args) {
        String[][] testArrayAllOk = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "3"},
                {"1", "2", "3", "4"}
        };
        String[][] testArrayBadRowsCount = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "3"},
                {"1", "2", "3", "3"},
                {"1", "2", "3", "4"}
        };
        String[][] testArrayBadColsCount = {
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "3", "5"},
                {"1", "2", "3", "4"}
        };
        String[][] testArrayBadValues = {
                {"11", "21", "31", "41"},
                {"12", "22", "32", "42"},
                {"13", "23", "33", "43"},
                {"14", "24", "!!", "44"}
        };

        System.out.println("--------------testArrayAllOk-----------------------");
        try {
            System.out.println("Summa = " + checkAndSumArray(testArrayAllOk));
        } catch (MyArrayDataException | MySizeArrayException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------testArrayBadColsCount----------------");
        try {
            System.out.println("Summa = " + checkAndSumArray(testArrayBadColsCount));
        } catch (MyArrayDataException | MySizeArrayException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------testArrayBadRowsCount----------------");
        try {
            System.out.println("Summa = " + checkAndSumArray(testArrayBadRowsCount));
        } catch (MyArrayDataException | MySizeArrayException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------testArrayBadValues-------------------");
        try {
            System.out.println("Summa = " + checkAndSumArray(testArrayBadValues));
        } catch (MyArrayDataException | MySizeArrayException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int checkAndSumArray(String[][] test) throws MySizeArrayException, MyArrayDataException {

        if (test.length != VALID_ARRAY_SIZE) throw new MySizeArrayException("Не верный размер массива");
        for (int i = 0; i < test.length; i++)
            if (test[i].length != VALID_ARRAY_SIZE) throw new MySizeArrayException("Не верный размер массива");


        int i = 0, j = 0, totalSum = 0;

        try {

            for (i = 0; i < test.length; i++) {

                for (j = 0; j < test[i].length; j++) {
                    totalSum += Integer.parseInt(test[i][j]);
                }
            }
            return totalSum;
        } catch (NumberFormatException e) {
            String arr = Arrays.deepToString(test);

            arr = arr.replace("],", "],\n");
            throw new MyArrayDataException("Ошибка в строке=" + ++i + " столбце=" + ++j + "\n" + arr);
        }
    }
}
