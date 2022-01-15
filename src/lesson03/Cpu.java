package lesson03;

public class Cpu {
    private int clockFrequency;
    private int coreCount;
    private int cashSize;

    public Cpu(int clockFrequency, int coreCount, int cashSize) {
        this.clockFrequency = clockFrequency;
        this.coreCount = coreCount;
        this.cashSize = cashSize;
    }

    @Override
    public String toString() {
        return "Cpu: " + '\n' +
                "       clockFrequency - " + clockFrequency + '\n' +
                "       coreCount ------ " + coreCount + '\n' +
                "       cashSize ------- " + cashSize + '\n';
    }
}
