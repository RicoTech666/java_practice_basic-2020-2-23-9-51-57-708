package com.thoughtworks.module;

import com.thoughtworks.interfaces.AnswerGenerator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomAnswer implements AnswerGenerator {
    private final int ANSWER_LENGTH = 4;

    RandomAnswer() {
    }

    @Override
    public int[] getAnswer() {
        int[] answer = new int[ANSWER_LENGTH];
        Random r = new Random();
        Set<Integer> randomSet = new HashSet<>();
        while (randomSet.size() < ANSWER_LENGTH) {
            randomSet.add(r.nextInt(10));
        }
        int i = 0;
        for (int num : randomSet) {
            answer[i++] = num;
        }
        return answer;
    }
}
