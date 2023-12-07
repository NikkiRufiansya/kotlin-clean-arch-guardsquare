package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.he  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC0206he {
    boolean setX() default true;

    Class<?> setY();
}