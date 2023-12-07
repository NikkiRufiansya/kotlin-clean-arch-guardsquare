package o;

import java.lang.reflect.Method;

/* renamed from: o.xa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588xa {
    public static final xa$MenuHostHelper$$ExternalSyntheticLambda1 setY = new xa$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    private final Method MenuHostHelper$$ExternalSyntheticLambda0;
    private final Method MenuHostHelper$$ExternalSyntheticLambda1;
    private final Method setIconTintList;

    public C0588xa(Method method, Method method2, Method method3) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = method;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = method2;
        this.setIconTintList = method3;
    }

    public final Object setIconTintList(String str) {
        pN.setY(str, "");
        Method method = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setX(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj != null) {
            try {
                Method method = this.setIconTintList;
                pN.setX(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}