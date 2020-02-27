package com.thoughtworks;


import com.thoughtworks.interfaces.AnswerGenerator;
import com.thoughtworks.module.Controller;
import com.thoughtworks.module.answers.FixedAnswer;

public class App {

    public static void main(String[] args) {
        AnswerGenerator answerGenerator = new FixedAnswer("D:\\RicoFile\\TW\\TwTraining\\Week10" +
                "\\jav_practice_basic-2020-2-23-9-51-57-708\\src\\main\\resources\\answer.txt");
        Controller controller = new Controller(answerGenerator);
        controller.gamePlay();
    }
}
