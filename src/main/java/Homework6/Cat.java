package Homework6;

class Cat extends Animal {
    private final int LENGTH_RUN = 200;
    private final double HEIGTH_JUMP = 2;

    void run(int length) {
        if ((length >= 0) && (length <= LENGTH_RUN)) System.out.println("run: true");
        else System.out.println("run: false");
    }


    void swim(int length) {
        System.out.println("swim: false");
    }


    void jump(double height) {
        if ((height >= 0) && (height <= HEIGTH_JUMP)) System.out.println("jump: true");
        else System.out.println("jump: fase");
    }
}
