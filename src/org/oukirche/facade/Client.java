package org.oukirche.facade;

public class Client {


    void exp(){
        Computer computer = new Computer();
        computer.runComputer();
    }
    public Client() {
        exp();
    }

    public static void main(String[] args) {
        new Client();
    }

}
