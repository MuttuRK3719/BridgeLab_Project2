package multithreading;

public class LiveLock {
    private boolean readyToGo = true;
    private String name;

    public LiveLock(String name) {
        this.name = name;
    }

    public boolean isReadyToGo() {
        return readyToGo;
    }

    public void setReadyToGo(boolean readyToGo) {
        this.readyToGo = readyToGo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void delivery(LiveLock lock) {
        while (readyToGo) {
            if (lock.isReadyToGo()) {
                System.out.println(name + " says: you go first" + lock.getName());
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        LiveLock agent1 = new LiveLock("Agent 1");
        LiveLock agent2 = new LiveLock("Agent 2");

        Thread thread1 = new Thread(() -> {
            agent1.delivery(agent1);
        });
        Thread thread2 = new Thread(() -> {
            agent2.delivery(agent2);
        });
        thread1.start();
        thread2.start();
    }
}
