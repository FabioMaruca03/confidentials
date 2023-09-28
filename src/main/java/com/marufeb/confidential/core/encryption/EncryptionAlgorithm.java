package com.marufeb.confidential.core.encryption;

import lombok.Data;

@Data
public sealed class EncryptionAlgorithm permits AES {
    private final String name;

    public <T extends Encryptable> T encrypt(T data) {
        return data.encrypt();
    }

    public <T extends Encryptable> T decrypt(T data) {
        return data.decrypt();
    }

}
