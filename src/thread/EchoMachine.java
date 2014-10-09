package thread;

public class EchoMachine {

    public EchoMachine() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String msg = "Program starts from here.";

        while (!msg.equals("0")) {
            System.out.println(msg);
            msg = input.nextLine();
        } // while

    } // constructor

    public static void main(String[] args) {
        EchoMachine myApp = new EchoMachine();
    }

} // EchoMachine