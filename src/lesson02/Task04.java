package lesson02;

public class Task04 {
    public static void main(String[] args) {
        int numberOne = 0b0100111;
        int numberTwo = 0b10011100101;

        int plus =  numberOne + numberTwo;
        int minus = numberOne - numberTwo;
        int multiply = numberOne * numberTwo;
        int divide = numberOne / numberTwo;
        int remainderOfDivision = numberTwo%numberOne;

        numberOne++;
        --numberTwo;
        ++numberTwo;
        numberOne--;

        int logicMultiply = numberOne & numberTwo;
        int logicPlus = numberOne | numberTwo;
        int xor = numberOne ^ numberTwo;
        int logicNegation = ~numberOne;
        int leftShift = numberOne<<2;
        int rightShift = numberOne>>2;

        boolean equals = numberOne == numberTwo;
        boolean notEquals = numberOne != numberTwo;
        boolean less = numberOne < numberTwo;
        boolean lessOr = numberOne <= numberTwo;
        boolean more = numberOne > numberTwo;
        boolean moreOr = numberOne >= numberTwo;

        boolean logicOR = (numberOne > numberTwo) | (numberOne < numberTwo);
        boolean logicAND = (numberOne > numberTwo) & (numberOne < numberTwo);
        boolean logicNOT =  !(numberOne > numberTwo);
        boolean logicXOR = (numberOne > numberTwo) ^ (numberOne < numberTwo);
        boolean abbreviatedOR = (numberOne > numberTwo) || (numberOne < numberTwo);
        boolean abbreviatedAND = (numberOne > numberTwo) && (numberOne < numberTwo);

        numberOne=numberTwo;
        numberOne+=numberTwo;
        numberOne-=numberTwo;
        numberOne*=numberTwo;
        numberOne/=numberTwo;
        numberOne%=numberTwo;
        numberOne&=numberTwo;
        numberOne|=numberTwo;
        numberOne^=numberTwo;
        numberOne<<=numberTwo;
        numberOne>>=numberTwo;
        numberOne>>>=numberTwo;

    }
}
