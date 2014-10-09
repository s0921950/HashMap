package kindle;

import java.util.concurrent.ExecutorService;

public class TestTask {
    private static ExecutorService global = null;

    public static void main(String[] args) {

        KindlePushTask firstThread = new KindlePushTask();

        //Starting the first thread 
        Thread thread1 = new Thread(firstThread);
        thread1.start();
    }

}