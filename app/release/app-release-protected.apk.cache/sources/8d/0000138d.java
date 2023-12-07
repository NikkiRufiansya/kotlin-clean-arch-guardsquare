package o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.yr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0632yr {
    String setX() default "";
}