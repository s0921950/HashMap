package thread;

public class LimitedPrintln extends Thread {

    public LimitedPrintln() {
        LinePrinter printlnThread = new LinePrinter();
        printlnThread.start(); // printlnThread執行緒開始 
        try {
            sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Main Thread去打斷LinePrinter囉");
        printlnThread.setFlag();//打斷printlnThread 
        System.out.println("LinePrinter應該可以閉嘴了!");
    } // constructor 

    public static void main(String[] args) {
        LimitedPrintln myApp = new LimitedPrintln();
    } // main 

    public class LinePrinter extends Thread {
        private volatile boolean again = true;

        public void setFlag() {
            again = false;
        }

        public boolean getFlag() {
            return again;
        }

        public void run() {
            int counter = 1;//執行次數的計數次 
            long beginTime = System.currentTimeMillis();

            while (getFlag() == true) { //請注意這邊
                System.out.println("第" + counter + "次 天氣好熱!!");
                counter++;
            } // while 
            long endTime = System.currentTimeMillis();
            double total = (endTime - beginTime) / 1000.0;
            System.out.println("以上是LinePrinter在" + total + "秒內無限迴圈println的結果");
        } // run 

    } // linePrinter    

} // class
