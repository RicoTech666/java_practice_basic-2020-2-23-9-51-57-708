package com.thoughtworks.module;


import java.util.HashSet;
import java.util.Set;

public class FormatChecker {
    private int[] codeAsArray;


    public FormatChecker(int[] codeAsArray) {
        this.codeAsArray = codeAsArray;
    }

    public boolean isFormatWrong() {
        int answerLength = 4;
        if (codeAsArray.length != answerLength) {
            return true;
        } else {
            if(checkHasRepeat()) {
                return true;
            }
            for (int i = 0; i < answerLength; i++) {
                boolean tempResult = (codeAsArray[i] >= 0) && (codeAsArray[i] <= 9);
                if (!tempResult) {
                    return true;
                }
            }
            return false;
        }
    }

    private boolean checkHasRepeat() {
        Set<Integer> set = new HashSet<>();
        for (int num : codeAsArray) {
            set.add(num);
        }
        return set.size() != codeAsArray.length;
    }
}
