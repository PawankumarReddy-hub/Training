package com.org.DemoMaven;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@Aspect //Important to say this is an Aspect config class
public class BeforeAdvice {

  //execution(RETURN_TYPE PACKAGE.CLASS.METHOD(..PARAMETER_LIST))
  //execution(* PACKAGE.*.*(..))
  @Before("execution(* com.org.DemoMaven.*.add(..))")
  public void allDaoAddMethods(Joinpoint joinPoint) {
    System.out.println("Intercepted method: " + joinPoint);
    System.out.println("Arguments: " + ((JoinPoint) joinPoint).getArgs());
    System.out.println( ((JoinPoint) joinPoint).getTarget());
  }

  @Before("execution(* com.org.DemoMaven.*.*(..))")
  public void allDaoAnyMethod(Joinpoint joinPoint) {
    System.out.println("Intercepted method: " + joinPoint);
    System.out.println("Arguments: " + joinPoint.getClass());
    System.out.println(((JoinPoint) joinPoint).getTarget());
  }
}
