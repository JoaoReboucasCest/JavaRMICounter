import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CounterServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CounterImpl counter = new CounterImpl();
            Naming.rebind("//localhost/Counter", counter);
            System.out.println("Objeto contador vinculado ao registro");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
