package org.oukirche.builder;

public class Director {
    Builder builder;

    public Director() {

    }

    public Device buildPhone(Builder builder){
        builder.buildMotherBoard();
        builder.buildScreen();
        builder.buildRam();
        builder.buildSpaceComponent();
        return builder.getDevice();
    }

    public Device buildLaptop(Builder builder){
        builder.buildMotherBoard();
        builder.buildRam();
        builder.buildSpaceComponent();
        builder.buildSpaceComponent();
        builder.buildScreen();
        return builder.getDevice();
    }
}
