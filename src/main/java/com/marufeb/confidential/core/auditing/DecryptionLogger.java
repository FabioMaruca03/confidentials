package com.marufeb.confidential.core.auditing;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class DecryptionLogger {
    @Pointcut("execution(* com.marufeb.confidential.core.encryption.Encryptable.decrypt())")
    public void decrypt() {}

    @Before("decrypt()")
    public void logDecryption(JoinPoint joinPoint) {
        log.info("Decryption of {}", joinPoint.getSignature().getName());
    }

    @After("decrypt()")
    public void logDecryptionEnd() {
        log.info("Decryption ended");
    }

    @AfterThrowing("decrypt()")
    public void logDecryptionError() {
        log.warn("Decryption failed");
    }

}
