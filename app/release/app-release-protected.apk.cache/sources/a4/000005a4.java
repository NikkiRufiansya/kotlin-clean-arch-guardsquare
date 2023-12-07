package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.hf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0207hf {
    String MenuHostHelper$$ExternalSyntheticLambda0();

    String[] setX() default {};
}