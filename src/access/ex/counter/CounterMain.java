package access.ex.counter;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();

        counter.increment(); // 최댓값 초과

        int count = counter.getCount();
        System.out.println(count);
    }
}
