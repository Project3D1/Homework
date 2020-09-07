package Homework6;

import com.sun.java.accessibility.util.SwingEventMonitor;

public abstract class Animal {
   final int LENGTH_RUN = 0;
   final int LENGTH_SWIM = 0;
   final double HEIGTH_JUMP = 0;

 abstract void run(int length);
 abstract void swim(int length);
 abstract void jump(double heigth);
}




