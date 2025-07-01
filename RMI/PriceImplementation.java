package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PriceImplementation extends UnicastRemoteObject implements PriceInterface {
    protected PriceImplementation() throws RemoteException{
        super();
    }

    public double calculateSP(double costPrice, double discount) throws RemoteException{
        return costPrice - discount;
    }
}
