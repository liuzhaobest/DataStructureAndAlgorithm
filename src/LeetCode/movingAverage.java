package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class movingAverage {
    public static void  main(String[] args){
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1));
        System.out.println(m.next(10));
        System.out.println(m.next(3));
        System.out.println(m.next(5));
        System.out.println();

    }

    static class MovingAverage{
        int size;
        int numberInWindow;
        double total;
        double average;
        Queue<Double> numQueue = new LinkedList<>();

        MovingAverage(int a){
            size = a;
            numberInWindow = 0;
            total = 0;
            average = 0;
        }
        public double next(double nextNum) {
            if(numberInWindow == size) {
                total -= numQueue.remove();
                total += nextNum;
                numQueue.add(nextNum);
                average = total / size;
            }
            else{
                numQueue.add(nextNum);
                numberInWindow++;
                total += nextNum;
                average = total / numberInWindow;
            }
            return average;
        }
    }
}
