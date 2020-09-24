package Homework2_1.Obstacle;

import Homework2_1.Participants.Participants;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean doIt(Participants participants) {
       if (participants.jump() > height) {
           System.out.println("Участник " + participants + " перепрыгнул стену");
           return true;
       }
       else {
           System.out.println("Участник " + participants + " не смог преодолеть препятсвие");
           return false;
       }
    }

}
