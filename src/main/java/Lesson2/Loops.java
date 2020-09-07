package Lesson2;

public class Loops {
    public static void main(String[] args) {
//        forExample();
//        innerLoop();
        whileExample();
    }

    private static void whileExample() {
        int a = 10;
        while (a > 0) {
            System.out.println(a);
            a--;
        }
    }


    private static void innerLoop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue;
                }
                if (j == 5) {
                    break;
                }
                System.out.println(" " + i + j);
            }
            System.out.println();
        }
    }

    private static void forExample() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

    }
    
}
