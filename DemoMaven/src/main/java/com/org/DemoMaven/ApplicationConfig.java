package com.org.DemoMaven;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//Step-3 - Add the annotation
@EnableAspectJAutoProxy
@ComponentScan("com.org.DemoMaven")
public class ApplicationConfig {
}
