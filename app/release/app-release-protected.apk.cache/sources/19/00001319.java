package o;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class xa$MenuHostHelper$$ExternalSyntheticLambda1 {
    private xa$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    public /* synthetic */ xa$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    public static C0588xa setX() {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        return new C0588xa(method3, method2, method);
    }
}