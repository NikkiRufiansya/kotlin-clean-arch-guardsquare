package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface oU {
    int MenuHostHelper$$ExternalSyntheticLambda0() default 1;

    String MenuHostHelper$$ExternalSyntheticLambda1() default "";

    int[] setIconTintList() default {};

    String setX() default "";

    String setY() default "";
}