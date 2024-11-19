import java.util.*;
class Square implements Runnable {
    public int x;
    public Square(int num) {
        x = num;
    }
    public void run() {
        System.out.println("Thread 2: Square of " + x + " is: " + x * x);
    }
}
class Cube implements Runnable {
    public int x;
    public Cube(int num) {
        x = num;
    }
    public void run() {
        System.out.println("Thread 3: Cube of " + x + " is: " + x * x * x);
    }
}
class GenerateNos implements Runnable {
    public void run() {
        int num = 0;
        Random r = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                num = r.nextInt(100);
                System.out.println("Thread 1: Generated random number is " + num);
                Thread t1 = new Thread(new Square(num));
                t1.start();
                Thread t2 = new Thread(new Cube(num));
                t2.start();
                Thread.sleep(1000);
                System.out.println("--------------------------------------");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
} // End of GenerateNos
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new GenerateNos());
        t.start();
    }
}