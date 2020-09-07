package Homework6;

class Dog extends Animal {
    private final int LENGTH_RUN = 500;
    private final int LENGTH_SWIM = 10;
    private final double HEIGTH_JUMP = 0.5;

    void run(int length) {
        if ((length >= 0) && (length <= LENGTH_RUN)) System.out.println("run: true");
    }

    void swim(int length) {
        if ((length >= 0) && (length <= LENGTH_SWIM)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }

    void jump(double height) {
        if ((height >= 0) && (height <= HEIGTH_JUMP)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}
