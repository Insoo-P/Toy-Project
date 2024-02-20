package com.insoo.javapractice.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

/**
 * 1. 의미 부여
 * 2. 검증 및 유효성 검사
 * 3. 로깅 및 디버깅
 * 4. 설정 및 구성
 *
 * 5. 리플렉션과 Annotation Processing API 사용
 * 6. Aspect-Oriented Programming (AOP)
 * 7. 커스텀 애노테이션 프로세서 작성
 * 8. 런타임 코드 생성
 */
public class AnnotationReflection {
    public static void main(String[] args) throws NoSuchMethodException {
        Method[] methods = AnnotationReflection.class.getMethods();
        Arrays.stream(methods).forEach(v -> {
            ReflectionAnnotation annotation = v.getAnnotation(ReflectionAnnotation.class);
            if(!Objects.isNull(annotation)){
                if(annotation.value().equals("Insoo")){
                    try {
                        v.invoke(null, "박인수");
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("#### annotation value : " + annotation.value());
                System.out.println("#### annotation count : " + annotation.count());
            }
        });
        // PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);

        AnnotationReflection annotationReflectionClass = new AnnotationReflection();
        annotationReflectionClass.method3();
    }

    @ReflectionAnnotation(value = "Insoo", count = 50)
    public static void method1(String param){
        System.out.println("#### method1 실행 : " + param);
    }

    @ReflectionAnnotation
    public static void method2(){}

    @ReflectionAnnotation
    public void method3(){
        System.out.println("#### this : " + this);
    }
}




