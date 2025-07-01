// Client/server application to find product of two numbers.

package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProductInterface extends Remote {
    double multiply(int a, int b) throws RemoteException;
}
