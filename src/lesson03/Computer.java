package lesson03;

public final class Computer implements Verifiable, Includable {
    private String type;
    private double cost;
    private String brand;
    private String model;
    private int maxWorkingCount;
    private boolean onOffStatus;
    private Cpu cpu;
    private Ram ram;
    private Hdd hdd;

    public Computer(String type, double cost, String brand, String model, int maxWorkingCount) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
        this.onOffStatus = false;
    }
    public Computer(String type, double cost, String brand, String model, int maxWorkingCount, Cpu cpu, Ram ram, Hdd hdd) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
        this.onOffStatus = false;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public void setRam(Ram ram) {
        this.ram = ram;
    }
    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    @Override
    public boolean checkComponents() {
        if (cpu==null || ram==null || hdd==null) {
            System.out.println("Computer broken");
            return false;
        } else return true;
    }
    @Override
    public boolean checkWorkingCount() {
        if (maxWorkingCount>0) {
            maxWorkingCount--;
            return true;
        } else {
            System.out.println("Computer dead");
            return false;
        }
    }
    @Override
    public boolean checkStatus() {
        return onOffStatus;
    }
    @Override
    public void turnOn(int liveOrDead) {
        System.out.println("Trying turn on. ");
        if (checkComponents() && (!checkStatus() & checkWorkingCount())) {
            if(randomDead(liveOrDead)) {
                onOffStatus = true;
                System.out.println("Computer turn on. ");
            } else {
                System.out.println("Computer dead. ");
            }
        }
    }
    @Override
    public void turnOff(int liveOrDead) {
        System.out.println("Trying turn off. ");
        if (checkComponents() && (checkStatus() & checkWorkingCount())){
            if(randomDead(liveOrDead)) {
                onOffStatus = false;
                System.out.println("Computer turn off. ");
            } else {
                System.out.println("Computer dead. ");
            }
        }
    }
    private boolean randomDead(int liveOrDead) {
        int random = (int) Math.round(Math.random());
        if (liveOrDead == random) {
            return true;
        } else {
            onOffStatus = false;
            maxWorkingCount = 0;
            return false;
        }
    }
    @Override
    public String toString() {
        return "Computer:\n" +
                "   type ------------ " + type + '\n' +
                "   cost ------------ " + cost + '\n' +
                "   brand ----------- " + brand + '\n' +
                "   model ----------- " + model + '\n' +
                "   maxWorkingCount - " + maxWorkingCount + '\n' +
                "   status ---------- " + onOffStatus + '\n' +
                "   " + cpu.toString() +
                "   " + ram.toString() +
                "   " + hdd.toString();
    }
}
