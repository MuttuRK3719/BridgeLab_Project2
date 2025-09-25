package multithreading;

import java.util.concurrent.Semaphore;

public class DiningPhilosophers {
    private static final int NUM_PHILOSOPHERS = 5;
    private static final Semaphore[] chopsticks = new Semaphore[NUM_PHILOSOPHERS];
    private static final Semaphore butler = new Semaphore(NUM_PHILOSOPHERS - 1);

    static {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            chopsticks[i] = new Semaphore(1);
        }
    }

    static class Philosopher extends Thread {
        private final int id;

        Philosopher(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    think();
                    eat();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void think() throws InterruptedException {
            System.out.println("Philosopher " + id + " is thinking...");
            Thread.sleep((int) (Math.random() * 1000));
        }

        private void eat() throws InterruptedException {
            butler.acquire();
            chopsticks[id].acquire();
            chopsticks[(id + 1) % NUM_PHILOSOPHERS].acquire();

            System.out.println("Philosopher " + id + " is eating!");
            Thread.sleep((int) (Math.random() * 1000));
            chopsticks[id].release();
            chopsticks[(id + 1) % NUM_PHILOSOPHERS].release();
            butler.release();
            System.out.println("Philosopher " + id + " finished eating.");

        }
    }

    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i);
            philosophers[i].start();
        }
    }
}