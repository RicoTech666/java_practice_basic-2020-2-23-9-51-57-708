package com.thoughtworks.module;

import com.thoughtworks.exceptions.WrongInputException;
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
            String input = sc.next();
            InputResolver inputResolver = new InputResolver(input);
            try {
                int[] resolvedInput = inputResolver.resolveInput();
            } catch (WrongInputException e) {
                e.getMessage();
            }
        }
    }

}
