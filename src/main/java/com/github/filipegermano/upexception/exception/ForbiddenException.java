package br.com.uppersystems.upexception.exception;

import br.com.uppersystems.upexception.enums.ExceptionMessage;

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
