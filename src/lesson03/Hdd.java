package lesson03;

public class Hdd {
    private String type;
    private int capacity;
    private String brand;

    public Hdd(String type, int capacity, String brand) {
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Hdd: " + '\n' +
                "       type ----- " + type + '\n' +
                "       capacity - " + capacity + '\n' +
                "       brand ---- " + brand + '\n';
    }

}
