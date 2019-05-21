package com.github.filipegermano.upexception.exception;

import com.github.filipegermano.upexception.enums.ExceptionMessage;

/**
 * This class represents the exceptions where the server generated some error.
 *
 * @author Filipe Germano
 */
public class ServerErrorException extends UpException {

    public ServerErrorException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }
}
