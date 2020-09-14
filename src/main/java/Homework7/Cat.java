package Homework7;

@SuppressWarnings("unused")
public class Cat {
    private String name;
    private int appetite;
    private boolean wellFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.wellFed = false;
    }

    public String toString() {
        return "Cat: " + name + " Appetite: " + appetite + " Well-fed: " + wellFed;
    }

    public void eat(Plate p) {
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            wellFed = true;
        }

    }
}
