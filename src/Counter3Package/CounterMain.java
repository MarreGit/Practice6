package Counter3Package;

public class CounterMain {
    public static void main(String[] args) {
        Counter user = new Counter(0, 0, "stop");

        user.counter();
        user.printOut();

    }
}
