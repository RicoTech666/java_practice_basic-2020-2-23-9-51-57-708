package com.thoughtworks.module;

import com.thoughtworks.interfaces.AnswerGenerator;

import java.util.Scanner;

public class Controller {
    private final int ATTEMPT_COUNT = 6;
    private AnswerGenerator answerGenerator;

    public Controller(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator;
    }

    public void gamePlay() {
        int attemptCount = ATTEMPT_COUNT;
        int[] answer = answerGenerator.getAnswer();
        String resultToBePrinted = "";
        Scanner sc = new Scanner(System.in);

        while (attemptCount > 0) {

        }
    }

    public static void main(String[] args) {
        int[] test = new int[4];
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < test.length; i++) {
            test[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.println(test[i]);
        }

    }
}
