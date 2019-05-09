package br.com.uppersystems.upexception.exception;

import br.com.uppersystems.upexception.enums.ExceptionMessage;

/**
 * This class represents the exceptions related to resource requests that were rejected by the bussiness logic.
 *
 * @author Filipe Germano
 */
public class UnauthorizedException extends UpException {

    public UnauthorizedException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }
}
