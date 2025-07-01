// Client/server application to find product of two numbers.


package RMI;

import java.rmi.Naming;

public class ProductClient {
    public static void main(String[] args) {
        try{
            ProductInterface stub = (ProductInterface) Naming.lookup("rmi://localhost/ProductService");
            int a = 6;
            int b = 9;
            double result = stub.multiply(a,b);
            System.out.println("Product = "+result);
        }catch (Exception e){
            System.err.println("Client Error : " + e);
        }
    }
}
