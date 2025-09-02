
package com.dev.catalog.admin.infrastructure;

import com.dev.catalog.admin.application.UserCase;

public class Main {
    public static void main(String[] args) {
        System.out.println(new UserCase().execute());
    }
}
