//// Client/server application to find product of two numbers.

package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ProductImplementation extends UnicastRemoteObject implements ProductInterface{

    protected ProductImplementation() throws RemoteException {
        super();
    }

    public double multiply(int a, int b) throws RemoteException{
        return a*b;
    }
}
