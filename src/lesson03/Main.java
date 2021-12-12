package lesson03;

public class Main {
    public static void main(String[] args) {

        Computer computer01 = new Computer("desktop", 2555.5, "Aser", "L-7", 6);
        computer01.setCpu(new Cpu(3100,4,64));
        computer01.setHdd(new Hdd("SSD", 512, "Toshiba"));
        computer01.setRam(new Ram(16, "DDR-4"));

        Computer computer02 = new Computer("laptop", 4520.0, "Apple", "Pro", 20,
                new Cpu(3400,8,128),
                new Ram(32, "DDR-4"),
                new Hdd("SSD", 1024, "Seagate"));

        computer01.turnOn(LiveOrDead.enterLiveOrDeadNumber());
        computer01.turnOff(LiveOrDead.enterLiveOrDeadNumber());

        computer02.turnOn(LiveOrDead.enterLiveOrDeadNumber());
        computer02.turnOff(LiveOrDead.enterLiveOrDeadNumber());

        System.out.println(computer01.toString());
        System.out.println(computer02.toString());
    }
}
