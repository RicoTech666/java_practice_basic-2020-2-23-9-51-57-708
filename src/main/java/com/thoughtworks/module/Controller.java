package com.thoughtworks.module;

import com.thoughtworks.exceptions.WrongInputException;
import com.thoughtworks.interfaces.AnswerGenerator;

import java.util.Scanner;

public class Controller {
    private AnswerGenerator answerGenerator;

    public Controller(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator;
    }

    public void gamePlay() {
        int attemptCount = 6;
        int[] answer = answerGenerator.getAnswer();
        StringBuilder resultToBePrinted = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        while (attemptCount > 0) {
            String input = sc.next();
            String comparatorResult = "";
            resultToBePrinted.append(input).append(" ");
            InputResolver inputResolver = new InputResolver(input);
            try {
                int[] resolvedInput = inputResolver.resolveInput();
                Comparator comparator = new Comparator(answer, resolvedInput);
                ComparatorResultTranslator comparatorResultTranslator = new ComparatorResultTranslator(comparator);
                comparatorResult = comparatorResultTranslator.getComparatorResult();
                resultToBePrinted.append(comparatorResult).append("\n");
                attemptCount--;
            } catch (WrongInputException e) {
                resultToBePrinted.append(e.getMessage()).append("\n");
            }
            if ("4A0B".equals(comparatorResult)) {
                resultToBePrinted.append("Congratulations, you win!");
                System.out.println(resultToBePrinted.toString());
                return;
            }
            System.out.println(resultToBePrinted.toString());
        }
        System.out.println("Unfortunately, you have no chance, the answer is " +
                answerGenerator.getAnswerAsString() + "!");
    }

}
