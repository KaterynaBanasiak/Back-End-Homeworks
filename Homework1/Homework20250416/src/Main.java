public class Main {

    public static volatile boolean isRunning = true;

    public static void main(String[] args) {
        // создаём потоки
        Thread thread1 = new Thread(new DivisibleByTwo());
        Thread thread2 = new Thread(new DivisibleByThree());

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        isRunning = false;
        System.out.println("Программа завершена.");
    }
}
