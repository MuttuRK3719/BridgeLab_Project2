package multithreading;

public class Vilatal {
    // Java program to illustrate non-volatile boolean flag
        static  boolean exit = false;

        public static void main(String[] args)
        {
            System.out.println("started main thread..");

            // a thread inside main thread
            new Thread() {
                public void run()
                {
                    System.out.println("started inside thread..");

                    // inside thread caches the value of exit,
                    // so changes made to exit are not visible here
                    while (!exit) // will run infinitely
                    {
                    }

                    // this will not be printed.
                    System.out.println("exiting inside thread..");
                }
            }.start();

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Caught :" + e);
            }

            // so that we can stop the threads
            exit = true;
            System.out.println("exiting main thread..");
        }
    }