package Generics.UpperLowerBound;

import java.util.List;

public class Triplet<TYPE> {

    private TYPE first;
    private TYPE second;
    private TYPE third;

    public Triplet(TYPE first, TYPE second, TYPE third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public TYPE getFirst() {
        return first;
    }

    public TYPE getSecond() {
        return second;
    }

    public TYPE getThird() {
        return third;
    }
}
