package com.thoughtworks.module.answers;

import com.thoughtworks.interfaces.AnswerGenerator;
import com.thoughtworks.module.FormatChecker;

import java.io.FileReader;
import java.util.Arrays;

public class FixedAnswer implements AnswerGenerator {

    private final int ANSWER_LENGTH = 4;
    private String answerFileName;

    public FixedAnswer(String answerFileName) {
        this.answerFileName = answerFileName;
    }

    @Override
    public int[] getAnswer() {
        int[] answerArr = new int[ANSWER_LENGTH];
        try {
            FileReader fr = new FileReader(answerFileName);
            char[] charBuffer = new char[1024];
            int len;
            while ((len = fr.read(charBuffer)) != -1) {
                    char[] answerCharArr = Arrays.copyOfRange(charBuffer, 0, len);
                    answerArr = charArrToInt(answerCharArr);
                    FormatChecker formatChecker = new FormatChecker(answerArr);
                    if(!formatChecker.checkCodeAsArray()){
                        RandomAnswer randomAnswer = new RandomAnswer();
                        answerArr = randomAnswer.getAnswer();
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
            RandomAnswer randomAnswer = new RandomAnswer();
            answerArr = randomAnswer.getAnswer();
        }
        return answerArr;
    }

    private int[] charArrToInt(char[] charArr) {
        int[] arr = new int[charArr.length];
        int i = 0;
        for (Character c : charArr) {
            arr[i++] = Integer.parseInt(String.valueOf(c));
        }
        return arr;
    }
}
