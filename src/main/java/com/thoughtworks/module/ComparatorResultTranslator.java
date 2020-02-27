package com.thoughtworks.module;

class ComparatorResultTranslator {
    private Comparator comparator;

    ComparatorResultTranslator(Comparator comparator) {
        this.comparator = comparator;
    }

    String getComparatorResult() {
        int numCorrectOnly = comparator.getCorrectNum();
        int numAndPosCorrect = comparator.getCorrectNumAndPosition();
        return numAndPosCorrect + "A" + numCorrectOnly + "B";
    }
}
