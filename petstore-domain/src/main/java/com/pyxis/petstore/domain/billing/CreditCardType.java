package com.pyxis.petstore.domain.billing;

import java.util.HashMap;
import java.util.Map;

public enum CreditCardType {
    visa("Visa"), mastercard("MasterCard"), amex("American Express");

    private final String commonName;

    CreditCardType(String commonName) {
        this.commonName = commonName;
    }

    public String commonName() {
        return commonName;
    }

    @Override public String toString() {
        return name();
    }

    public static Map<CreditCardType, String> options() {
        Map<CreditCardType, String> options = new HashMap<CreditCardType, String>();
        for (CreditCardType type : values()) {
            options.put(type, type.commonName());
        }
        return options;
    }
}
