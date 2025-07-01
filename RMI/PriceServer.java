package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class PriceServer {
    public static void main(String[] args) {
        try{
            PriceImplementation priceImplementation = new PriceImplementation();
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost/PriceService",priceImplementation);
            System.out.println("Server is ready...");
        }catch (Exception e){
            System.err.println("Server Error: "+ e);
        }
    }
}
