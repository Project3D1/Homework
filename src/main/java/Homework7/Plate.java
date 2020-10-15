package Homework7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public String toString() {
        return "Plate: " + food;
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int getFood() {
        return food;
    }

    void increaseFood(int amount) {
        food += amount;
    }


}
