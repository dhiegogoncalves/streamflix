package com.dev.catalog.admin.domain.exceptions;

import java.util.List;
import com.dev.catalog.admin.domain.validation.Error;

public class DomainException extends NoStacktraceException {
    private final List<Error> errors;

    public DomainException(final List<Error> errors) {
        super("");
        this.errors = errors;
    }

    public static DomainException with(final Error errors) {
        return new DomainException(List.of(errors));
    }

    public static DomainException with(final List<Error> errors) {
        return new DomainException(errors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
