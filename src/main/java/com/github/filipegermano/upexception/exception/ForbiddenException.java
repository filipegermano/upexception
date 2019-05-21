package com.github.filipegermano.upexception.exception;

import com.github.filipegermano.upexception.enums.ExceptionMessage;

/**
 * Class that represents the exceptions related to requests where the callers has no access.
 *
 * @author Filipe Germano
 */
public class ForbiddenException extends UpException {

    public ForbiddenException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }
}
