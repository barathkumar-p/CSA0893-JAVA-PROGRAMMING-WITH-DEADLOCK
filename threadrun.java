public class threadRun implements Runnable {

    public void run() {
        System.out.println("Hello world, This is an example of a runnable Java thread.");
    }

    public static void main(String[] args) {
        threadRun a = new threadRun();
        a.run();
    }
}
