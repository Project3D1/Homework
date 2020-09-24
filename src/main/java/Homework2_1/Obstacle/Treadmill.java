package Homework2_1.Obstacle;

import Homework2_1.Participants.Participants;

public class Treadmill implements Obstacle {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public boolean doIt(Participants participants) {
        if (participants.run() > distance) {
            System.out.println("Участник " + participants + " перепрыгнул стену");
            return true;
        }
        else {
            System.out.println("Участник " + participants + " не смог преодолеть препятсвие");
            return false;
        }
    }
    }
}
