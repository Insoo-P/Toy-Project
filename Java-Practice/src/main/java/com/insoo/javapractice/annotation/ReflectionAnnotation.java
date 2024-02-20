package com.insoo.javapractice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 유지기간 지정
@Retention(RetentionPolicy.RUNTIME)
// 적용 대상
@Target({ElementType.METHOD})
public @interface ReflectionAnnotation {
    // 상수 선언 가능
    static final int ID = 100;
    String value() default "Test";
    int count() default 20;
}