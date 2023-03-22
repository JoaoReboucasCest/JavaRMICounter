import java.rmi.Naming;

public class CounterClient {
    public static void main(String[] args) {
        try {
            Counter counter = (Counter) Naming.lookup("//localhost/Counter");
            counter.increment();
            System.out.println("Count is " + counter.getCount());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
