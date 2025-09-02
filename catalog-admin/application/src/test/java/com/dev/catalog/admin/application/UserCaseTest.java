
package com.dev.catalog.admin.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserCaseTest {
    @Test
    void testCreateUseCase() {
        Assertions.assertNotNull(new UserCase());
        Assertions.assertNotNull(new UserCase().execute());
    }
}
