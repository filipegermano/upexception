package com.github.filipegermano.upexception.exception;

import com.github.filipegermano.upexception.enums.ExceptionMessage;

/**
 * This class represents the exceptions related to malformed requests.
 *
 * @author Filipe Germano
 */
public class BadRequestException extends UpException {

    public BadRequestException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }
}
