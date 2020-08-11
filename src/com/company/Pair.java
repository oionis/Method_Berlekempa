package com.company;

public final class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T1 firstValue, T2 secondValue) {
        first = firstValue;
        second = secondValue;
    }

    public Pair(Pair<T1, T2> pairToCopy) {
        first = pairToCopy.first;
        second = pairToCopy.second;
    }
}