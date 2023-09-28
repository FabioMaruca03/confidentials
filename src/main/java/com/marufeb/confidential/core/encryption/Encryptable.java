package com.marufeb.confidential.core.encryption;

public interface Encryptable {
    <T extends Encryptable> T encrypt();

    <T extends Encryptable> T decrypt();

}
