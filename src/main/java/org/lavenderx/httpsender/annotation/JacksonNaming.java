package org.lavenderx.httpsender.annotation;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JacksonNaming {

    Class<? extends PropertyNamingStrategy> value() default PropertyNamingStrategy.SnakeCaseStrategy.class;
}
