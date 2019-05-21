package com.github.filipegermano.upexception.exception;

import com.github.filipegermano.upexception.enums.ExceptionMessage;

/**
 * This class represents the exceptions related to not found requests.
 *
 * @author Filipe Germano
 */
public class NotFoundException extends UpException {

    public NotFoundException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }
}
