package org.oukirche.factorymethod;

public class Client {

    void exp(){
        FigureFactory figureFactory = new FigureFactory();
        Figure cercle = figureFactory.createFigure("cercle");
        Figure rectangle = figureFactory.createFigure("rectangle");
        cercle.dessiner();
        rectangle.dessiner();
    }

    public Client() {
        exp();
    }

    public static void main(String[] args) {
        new Client();
    }

}
