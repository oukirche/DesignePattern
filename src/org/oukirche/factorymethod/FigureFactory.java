package org.oukirche.factorymethod;

public class FigureFactory {

    public Figure createFigure(String figureType) {
        if("cercle".equals(figureType))
            return new Cercle();
        if("rectangle".equals(figureType))
            return new Rectangle();
        return null;
    }
}
