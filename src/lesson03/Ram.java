package lesson03;

public class Ram {
    private int capacity;
    private String type;

    public Ram(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ram: " + '\n' +
                "       capacity - " + capacity + '\n' +
                "       type ----- " + type + '\n';
    }
}
