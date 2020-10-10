package su.bzz.study.tasks;

public class MultiThread {
    static int COUNT = 10;
    public static void main(String[] args) throws InterruptedException {

        RunTest runTest = new RunTest();
        Thread thread1 = new Thread(runTest);
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < COUNT; i++) {
                System.out.println("Thread 2 finish " + Runtime.getRuntime().availableProcessors());
            }
        });
        thread1.setPriority(10);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Main thread finish");
    }

    static class RunTest implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < MultiThread.COUNT; i++) {
                System.out.println("Thread one run");
            }
        }
    }
}
