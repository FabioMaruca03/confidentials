package com.marufeb.confidential.annotations;

import com.marufeb.confidential.core.encryption.AES;
import com.marufeb.confidential.core.encryption.EncryptionAlgorithm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Encrypted {
    Class<? extends EncryptionAlgorithm> algorithm() default AES.class;
}

