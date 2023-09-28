package com.marufeb.confidential.dummy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyTest {

    @Bean
    public EncryptionDummy encryptionDummy() {
        return new EncryptionDummy();
    }

}
