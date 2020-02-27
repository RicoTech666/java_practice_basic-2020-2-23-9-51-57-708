package com.thoughtworks.module;

import com.thoughtworks.exceptions.WrongInputException;

public class InputResolver {
    private String input;

    public InputResolver(String input) {
        this.input = input;
    }

    public int[] resolveInput() throws WrongInputException {
        int[] resolvedInput = new int[input.length()];

        for (int i = 0; i < resolvedInput.length; i++) {
            resolvedInput[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        FormatChecker formatChecker = new FormatChecker(resolvedInput);
        if(!formatChecker.checkCodeAsArray()) {
                throw new WrongInputException("Wrong Input");
        }
        return resolvedInput;
    }
}
