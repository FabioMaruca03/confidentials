package com.marufeb.confidential.dummy;

import com.marufeb.confidential.core.encryption.Encryptable;
import lombok.Data;
import org.springframework.boot.test.context.TestComponent;

@Data
@TestComponent
public class EncryptionDummy implements Encryptable {
    private String name;
    private String surname;

    @Override
    public <T extends Encryptable> T encrypt() {
        return null;
    }

    @Override
    public <T extends Encryptable> T decrypt() {
        return null;
    }
}
