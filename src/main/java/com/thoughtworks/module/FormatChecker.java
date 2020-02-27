package com.thoughtworks.module;

import com.thoughtworks.interfaces.AnswerGenerator;

public class FormatChecker {
    private final int ANSWER_LENGTH = 4;
    private int[] codeAsArray;


    public FormatChecker(int[] codeAsArray) {
        this.codeAsArray = codeAsArray;
    }

    public boolean checkCodeAsArray() {
        if (codeAsArray.length != ANSWER_LENGTH) {
            return false;
        } else {
            for (int i = 0; i < ANSWER_LENGTH; i++) {
                boolean tempResult = (codeAsArray[i] >= 0) && (codeAsArray[i] <= 9);
                if (!tempResult) {
                    return false;
                }
            }
            return true;
        }
    }
}
