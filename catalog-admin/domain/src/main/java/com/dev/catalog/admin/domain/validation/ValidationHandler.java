package com.dev.catalog.admin.domain.validation;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(final Error error);

    ValidationHandler append(final ValidationHandler handler);

    ValidationHandler validate(final Validation validation);

    List<Error> getErrors();

    default boolean hasErrors() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    public interface Validation {
        void validate();
    }
}
