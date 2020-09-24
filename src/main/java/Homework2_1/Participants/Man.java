package Homework2_1.Participants;

public class Man implements Participants {

    private String name;
    private int run;
    private int jump;

    public Man(String man, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public int run() {
        System.out.println("Человек" + name + "бежит" + run);
        return run;
    }
    public int jump() {
        System.out.println("Человек" + name + "прыгнул на" + jump);
        return jump;
}
