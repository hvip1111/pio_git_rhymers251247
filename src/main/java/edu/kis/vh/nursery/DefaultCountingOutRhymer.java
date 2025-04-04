package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_INDEX = -1;
    private static final int DEFAULT_CAPACITY = 12;
    private static final int FULL_INDEX = DEFAULT_CAPACITY - 1;
    private static final int IF_EMPTY = -1;

    private final int[] numbers = new int[DEFAULT_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
