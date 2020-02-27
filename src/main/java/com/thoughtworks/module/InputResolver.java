package com.thoughtworks.module;

import com.thoughtworks.exceptions.WrongInputException;

class InputResolver {
    private String input;

    InputResolver(String input) {
        this.input = input;
    }

    int[] resolveInput() throws WrongInputException {
        int[] resolvedInput = new int[input.length()];

        for (int i = 0; i < resolvedInput.length; i++) {
            resolvedInput[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        FormatChecker formatChecker = new FormatChecker(resolvedInput);
        if(formatChecker.isFormatWrong()) {
                throw new WrongInputException("Wrong Input");
        }
        return resolvedInput;
    }
}
