package com.marufeb.confidential.core.auditing;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class EncryptionLogger {

    @Pointcut("execution(* com.marufeb.confidential.core.encryption.Encryptable.encrypt())")
    public void encrypt() {}

    @Before("encrypt()")
    public void logEncryption(JoinPoint joinPoint) {
        log.info("Encryption of {}", joinPoint.getSignature().getName());
    }

    @After("encrypt()")
    public void logEncryptionEnd() {
        log.info("Encryption ended");
    }

    @AfterThrowing("encrypt()")
    public void logEncryptionError() {
        log.warn("Encryption failed");
    }

}
