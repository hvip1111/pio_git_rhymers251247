package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_INDEX = -1;
    public static final int FULL_INDEX = 11;
    public static final int DEFAULT_CAPACITY = 12;
    public static final int ERROR_CODE = -1;

    private final int[] numbers = new int[DEFAULT_CAPACITY];

    public int total = EMPTY_INDEX;

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
            return ERROR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }

}
