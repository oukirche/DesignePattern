package org.oukirche.builder;

public class LaptopBuilder implements Builder{

    private Device laptop;
    private String brand;

    public LaptopBuilder(String brand) {
        this.brand = brand;
        laptop = new Device(brand);
    }

    @Override
    public void buildMotherBoard() {
        System.out.println("build the mother board for "+laptop.getBrand()+" laptop");
    }

    @Override
    public void buildRam() {

        laptop.setRamSize(16);
        System.out.println("build the RAM for "+laptop.getBrand()+" whith size : "+laptop.getRamSize());

    }

    @Override
    public void buildSpaceComponent() {
        int spaceSize = 500;
        System.out.println("build the ROM for "+laptop.getBrand()+" laptop with size : "+spaceSize+"G");
        laptop.setSpaceSize(spaceSize);
    }

    @Override
    public void buildScreen() {
        int screenSize = 16;
        System.out.println("build the screen for "+laptop.getBrand()+" laptop with size : "+screenSize);
        laptop.setScreenSize(screenSize);
    }

    @Override
    public Device getDevice() {
        return laptop;
    }


}
