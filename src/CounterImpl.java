import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CounterImpl extends UnicastRemoteObject implements Counter {
    private int count;

    public CounterImpl() throws RemoteException {
        count = 0;
    }

    public void increment() throws RemoteException {
        count++;
    }

    public int getCount() throws RemoteException {
        return count;
    }
}
