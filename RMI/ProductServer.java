//// Client/server application to find product of two numbers.


package RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ProductServer {
    public static void main(String[] args) {
        try{

            ProductImplementation productImplementation = new ProductImplementation();
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost/ProductService",productImplementation);
            System.out.println("Server is ready");

        }catch (Exception e){
            System.err.println("Server Error: " + e);
        }
    }
}
