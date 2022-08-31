package org.oukirche.adapter;

public class Client {

    void exp(Bank bank){
        bank.retirerArgent(500);
    }




    public Client() {
        exp(new DistributeurAdapter());
        System.out.println("-----------------------------------------------------------------------");
        exp(new AgenceAdapter());
        System.out.println("-----------------------------------------------------------------------");
        exp(new EcommerceAdapter());
    }

    public static void main(String[] args) {
        new Client();
    }
}
