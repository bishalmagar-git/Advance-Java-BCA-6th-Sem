//client-server application that calculates the selling price of an item with a cost price of Rs. 5000 and a discount of Rs. 50.

package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PriceInterface extends Remote {
    double calculateSP(double cp, double discount) throws RemoteException;
}
