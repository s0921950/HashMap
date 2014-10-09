package thread;

public class MultiThreadEchoMachine extends Thread {
    private volatile String msg = "Program starts from here.";

    public MultiThreadEchoMachine() {
        Thread listener = new InputListener(this);
        listener.start();
        this.start();
    } // constuctor

    public static void main(String[] args) {
        MultiThreadEchoMachine myApp = new MultiThreadEchoMachine();
    } // main

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void run() {
        while (true) {
            System.out.println(getMsg());
            try {
                sleep(3000);
            } catch (InterruptedException ie) {
            } //敢不敢刪這行?
        } // while
    }

    public class InputListener extends Thread {
        private MultiThreadEchoMachine app;
        private java.util.Scanner input;

        public InputListener(MultiThreadEchoMachine app) {
            this.app = app;
            input = new java.util.Scanner(System.in);
        }

        public void run() {
            String latest = input.nextLine();

            while (!latest.equals("0")) {
                app.setMsg(latest);
                latest = input.nextLine();
            }

            System.exit(0);
        } // run

    } // InputListener

} //class MultiThreadEchoMachine

