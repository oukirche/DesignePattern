package org.oukirche.singleton;

public class Singleton {
    public static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("instanciation de singleton");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
