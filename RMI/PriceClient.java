package RMI;

import java.rmi.Naming;

public class PriceClient {
    public static void main(String[] args) {
        try{

            PriceInterface stub = (PriceInterface) Naming.lookup("rmi://localhost/PriceService");
            double costPrice = 5000;
            double discount = 50;
            double sellingPrice = stub.calculateSP(costPrice, discount);
            System.out.println("Selling Price = Rs. " + sellingPrice);

        }catch (Exception e){
            System.out.println("Client Error: " + e);
        }
    }
}
