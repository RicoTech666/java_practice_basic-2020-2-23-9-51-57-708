package com.thoughtworks.module;

class Comparator {

    private int[] answer;
    private int[] input;

    Comparator(int[] answer, int[] input) {
        this.answer = answer;
        this.input = input;
    }

    int getCorrectNum() {
        int num = 0;
        for (int value : input) {
            for (int i : answer) {
                if (value == i) {
                    num++;
                }
            }
        }
        return num - getCorrectNumAndPosition();
    }

    int getCorrectNumAndPosition() {
        int num = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == answer[i]) {
                num++;
            }
        }
        return num;
    }

}
