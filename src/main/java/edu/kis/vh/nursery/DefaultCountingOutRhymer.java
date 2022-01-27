package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int ERROR = -1;
    private final int[] numbers = new int[SIZE];

    private int total = ERROR;

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
