package org.oukirche.singleton;

public class Client {

    void exp(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }

    public Client() {
        exp();
    }

    public static void main(String[] args) {
        new Client();
    }
}
