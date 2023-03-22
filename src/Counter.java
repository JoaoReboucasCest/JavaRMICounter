import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Counter extends Remote {
    public void increment() throws RemoteException;
    public int getCount() throws RemoteException;
}
