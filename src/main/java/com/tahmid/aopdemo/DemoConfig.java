package com.tahmid.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Tahmidul Islam
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.tahmid.aopdemo")
public class DemoConfig {

}
