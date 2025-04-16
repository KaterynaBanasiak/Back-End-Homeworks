public class DivisibleByThree implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (Main.isRunning) {
            if (i % 3 == 0) {
                System.out.println("Число делится на 3: " + i);
            }
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток деления на 3 прерван");
            }
        }
    }
}

