package com.github.filipegermano.upexception.exception;

import com.github.filipegermano.upexception.enums.ExceptionMessage;

import lombok.Getter;

public class UpException extends RuntimeException {

    @Getter
    private ExceptionMessage messageException;

    /**
     * Constructor of a UpException.
     *
     * @param exceptionMessage The {@link ExceptionMessage} that should be used to create the exception
     */
    public UpException(ExceptionMessage exceptionMessage) {

        super(exceptionMessage.getMessage());
        this.messageException = exceptionMessage;

    }

    /**
     * Static method that check if a new UpException should be thrown.
     *
     * @param expression       The expression that is checked
     * @param exceptionMessage The {@link ExceptionMessage} that should be thrown
     * @throws UpException If the expression is true, throw a UpException
     */
    public static void checkThrow(boolean expression, ExceptionMessage exceptionMessage) throws UpException {

        if (expression) {
            exceptionMessage.raise();
        }
    }

    /**
     * Static method that check if a new UpException should be thrown with a custom message.
     *
     * @param expression       The expression that is checked
     * @param exceptionMessage The {@link ExceptionMessage} that should be thrown
     * @param dynamicText      The custom text that will be placed in the exception message
     * @throws UpException If the expression is true, throw a UpException
     */
    public static void checkThrow(boolean expression, ExceptionMessage exceptionMessage, String... dynamicText) throws UpException {

        if (expression) {
            exceptionMessage.raise(dynamicText);
        }
    }

}
