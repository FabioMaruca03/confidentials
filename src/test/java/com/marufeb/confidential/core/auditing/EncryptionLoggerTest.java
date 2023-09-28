package com.marufeb.confidential.core.auditing;

import com.marufeb.confidential.core.encryption.Encryptable;
import com.marufeb.confidential.dummy.DummyTest;
import com.marufeb.confidential.dummy.EncryptionDummy;
import org.aspectj.lang.JoinPoint;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.Import;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ImportAutoConfiguration(AuditingConfig.class)
@SpringBootTest(classes = {EncryptionLogger.class, EncryptionDummy.class})
class EncryptionLoggerTest {
    @Autowired
    private Encryptable dummy;

    @SpyBean
    private EncryptionLogger encryptionLogger;

    @Test
    public void shouldLogEncryption() {
        dummy.encrypt();

        verify(encryptionLogger).logEncryption(any(JoinPoint.class));
        verify(encryptionLogger).logEncryptionEnd();

        dummy.decrypt();
    }

}

