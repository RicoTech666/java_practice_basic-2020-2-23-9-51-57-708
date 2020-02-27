package com.thoughtworks;


import com.thoughtworks.interfaces.AnswerGenerator;
import com.thoughtworks.module.FixedAnswer;

public class App {

    public static void main(String[] args) {
        AnswerGenerator answerGenerator = new FixedAnswer("D:\\RicoFile\\TW\\TwTraining\\Week10" +
                "\\java_practice_basic-2020-2-23-9-51-57-708\\src\\main\\resources\\answer.txt");
        int[] answer = answerGenerator.getAnswer();
        for (int i : answer) {
            System.out.println(i);
            System.out.println("--");
        }
    }
}
