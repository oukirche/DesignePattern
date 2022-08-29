package org.oukirche.builder;

public interface Builder{
    void buildMotherBoard();
    void buildRam();
    void buildSpaceComponent();
    void buildScreen();

    Device getDevice();
}
