package org.oukirche.bridge;

public class Tv implements Device{

    private int volumeLevel ;

    public Tv(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void turnOn() {
        if(!isEnabled())
            System.out.println("Turn on the radio");
    }

    @Override
    public void turnOff() {
        if(isEnabled())
            System.out.println("Turn off the radio");
    }

    @Override
    public void volumeUp() {
        if(volumeLevel == 100)
            System.out.println("The volume is Max");
        volumeLevel+=1;

    }

    @Override
    public void volumeDown() {
        if(volumeLevel == 0)
            System.out.println("The volume is Min");
        volumeLevel-=1;
    }
}
