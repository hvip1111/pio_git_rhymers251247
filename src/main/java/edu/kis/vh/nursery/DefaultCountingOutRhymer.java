package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT_NUM = 12;
    public static final int INT_TOTAL = -1;
    private int[] numbers = new int[INT_NUM];

    public int total = INT_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
