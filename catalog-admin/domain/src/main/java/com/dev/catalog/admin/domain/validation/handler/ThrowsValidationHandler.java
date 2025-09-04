package com.dev.catalog.admin.domain.validation.handler;

import java.util.List;
import com.dev.catalog.admin.domain.exceptions.DomainException;
import com.dev.catalog.admin.domain.validation.Error;
import com.dev.catalog.admin.domain.validation.ValidationHandler;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error error) {
        throw DomainException.with(error);
    }

    @Override
    public ValidationHandler append(final ValidationHandler handler) {
        throw DomainException.with(handler.getErrors());
    }

    @Override
    public ValidationHandler validate(final Validation validation) {
        try {
            validation.validate();
        } catch (final Exception ex) {
            throw DomainException.with(new Error(ex.getMessage()));
        }

        return this;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}
