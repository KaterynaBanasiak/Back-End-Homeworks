public class DivisibleByTwo implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (Main.isRunning) {
            if (i % 2 == 0) {
                System.out.println("Число делится на 2: " + i);
            }
            i++;
            try {
                Thread.sleep(100); // пауза для читаемости
            } catch (InterruptedException e) {
                System.out.println("Поток деления на 2 прерван");
            }
        }
    }
}
