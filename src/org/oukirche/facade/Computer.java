package org.oukirche.facade;

public class Computer {

    private CPU cpu;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        hardDrive = new HardDrive();
    }

    public void runComputer(){
        hardDrive.readData();
        ram.loadData();
        cpu.proccesData();
    }
}
