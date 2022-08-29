package org.oukirche.builder;

public class Client {


    void expBuildPhone(Builder builder){
        Director director = new Director();
        Device phone = director.buildPhone(builder);
        phone.toString();
    }

    void expBuildLaptop(Builder builder){
        Director director = new Director();
        Device laptop = director.buildPhone(builder);
        laptop.toString();
    }

    public Client() {
        expBuildLaptop(new LaptopBuilder("Asus"));
        System.out.println("------------------------------------------------------------------------------------");
        expBuildPhone(new PhoneBuilder("iPhone"));
    }

    public static void main(String[] args) {
        new Client();
    }
}
