package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class OnlyUpperCaseText implements Validator {

    private static final String ERROR_MESSAGE = "This question have to be in uppercase";

    @Override
    public void validate(String value, String conditionValue, List<String> errors) {

        for (int i=0 ; i<value.length(); i++) {
            if (Character.isLowerCase(value.charAt(i))) {
                errors.add(ERROR_MESSAGE);
                break;
            }
        }

    }
}
