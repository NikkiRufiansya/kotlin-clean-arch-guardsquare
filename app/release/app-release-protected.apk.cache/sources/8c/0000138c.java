package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.yq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0631yq {
    String setX();

    boolean setY() default false;
}