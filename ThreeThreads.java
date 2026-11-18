public class ThreeThreads {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            final int threadNumber = i;

            Thread thread = new Thread(() -> {
                System.out.println("Thread " + threadNumber + " is running");
            });

            thread.start();

            try {
                Thread.sleep(2); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}