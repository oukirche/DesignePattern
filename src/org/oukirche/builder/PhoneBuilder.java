package org.oukirche.builder;

public class PhoneBuilder implements Builder{

    private Device phone;
    private String brand;

    public PhoneBuilder(String brand) {
        this.brand = brand;
        phone = new Device(brand);
    }

    @Override
    public void buildMotherBoard() {
        System.out.println("build the mother board for "+phone.getBrand()+" phone");
    }

    @Override
    public void buildRam() {

        phone.setRamSize(4);
        System.out.println("build the RAM for "+phone.getBrand()+" whith size : "+phone.getRamSize());

    }

    @Override
    public void buildSpaceComponent() {
        int spaceSize = 128;
        System.out.println("build the ROM for "+phone.getBrand()+" phone with size : "+spaceSize+"G");
        phone.setSpaceSize(spaceSize);
    }

    @Override
    public void buildScreen() {
        int screenSize = 6;
        System.out.println("build the screen for "+phone.getBrand()+" phone with size : "+screenSize);
        phone.setScreenSize(screenSize);
    }

    @Override
    public Device getDevice() {
        return phone;
    }

    public String getBrand() {
        return brand;
    }

    public Device getPhone() {
        return phone;
    }
}
