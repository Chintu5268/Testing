public class ThreadPri {
  
  public static void main(String[] args) {
    // Create threads with different priorities
    Thread lowPriorityThread = new Thread(new Task(),"This is low thread");
    Thread normalPriorityThread = new Thread(new Task(), "Normal Priority Thread");
    Thread highPriorityThread = new Thread(new Task(), "High Priority Thread");

    // Set priorities
    lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // Priority 1
    normalPriorityThread.setPriority(Thread.NORM_PRIORITY); // Priority 5
    highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Priority 10

    // Start the threads
    lowPriorityThread.start();
    normalPriorityThread.start();
    highPriorityThread.start();
}

// Task to be performed by threads
static class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
        }
    }
}
}
