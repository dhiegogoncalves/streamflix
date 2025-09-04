package com.dev.catalog.admin.domain.category;

import com.dev.catalog.admin.domain.validation.Error;
import com.dev.catalog.admin.domain.validation.ValidationHandler;
import com.dev.catalog.admin.domain.validation.Validator;

public class CategoryValidator extends Validator {
    private final Category category;

    protected CategoryValidator(final Category category, final ValidationHandler handler) {
        super(handler);
        this.category = category;
    }

    @Override
    public void validate() {
        if (this.category.getName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }

}
