package com.marufeb.confidential.core.auditing;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@AutoConfiguration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.marufeb.confidential.core.auditing")
public class AuditingConfig {
}
