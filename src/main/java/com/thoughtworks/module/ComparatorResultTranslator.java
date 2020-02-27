package com.thoughtworks.module;

public class ComparatorResultTranslator {
    private Comparator comparator;

    public ComparatorResultTranslator(Comparator comparator) {
        this.comparator = comparator;
    }

    public String getComparatorResult() {
        int numCorrectOnly = comparator.getCorrectNum();
        int numAndPosCorrect = comparator.getCorrectNumAndPosition();
        return numAndPosCorrect + "A" + numCorrectOnly + "B";
    }
}
