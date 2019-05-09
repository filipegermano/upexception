package br.com.uppersystems.upexception.exception;

import br.com.uppersystems.upexception.enums.ExceptionMessage;

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
