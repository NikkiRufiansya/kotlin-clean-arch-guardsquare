package o;

/* renamed from: o.pc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369pc {
    public static final oY setX;

    static {
        oY oYVar;
        Object newInstance;
        Object newInstance2;
        int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 >= 65544 || MenuHostHelper$$ExternalSyntheticLambda0 < 65536) {
            try {
                try {
                    newInstance = Class.forName("o.pd").newInstance();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0(newInstance, "");
                    try {
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = oY.class.getClassLoader();
                        if (pN.MenuHostHelper$$ExternalSyntheticLambda0(classLoader, classLoader2)) {
                            throw e;
                        }
                        StringBuilder sb = new StringBuilder("Instance class was loaded from a different classloader: ");
                        sb.append(classLoader);
                        sb.append(", base type classloader: ");
                        sb.append(classLoader2);
                        throw new ClassNotFoundException(sb.toString(), e);
                    }
                } catch (ClassNotFoundException unused) {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0(newInstance3, "");
                    try {
                        if (newInstance3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        oYVar = (oY) newInstance3;
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                        ClassLoader classLoader4 = oY.class.getClassLoader();
                        if (pN.MenuHostHelper$$ExternalSyntheticLambda0(classLoader3, classLoader4)) {
                            throw e2;
                        }
                        StringBuilder sb2 = new StringBuilder("Instance class was loaded from a different classloader: ");
                        sb2.append(classLoader3);
                        sb2.append(", base type classloader: ");
                        sb2.append(classLoader4);
                        throw new ClassNotFoundException(sb2.toString(), e2);
                    }
                }
            } catch (ClassNotFoundException unused2) {
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            oYVar = (oY) newInstance;
            setX = oYVar;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0 >= 65543 || MenuHostHelper$$ExternalSyntheticLambda0 < 65536) {
            try {
                try {
                    newInstance2 = Class.forName("o.ph").newInstance();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0(newInstance2, "");
                    try {
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = oY.class.getClassLoader();
                        if (pN.MenuHostHelper$$ExternalSyntheticLambda0(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        StringBuilder sb3 = new StringBuilder("Instance class was loaded from a different classloader: ");
                        sb3.append(classLoader5);
                        sb3.append(", base type classloader: ");
                        sb3.append(classLoader6);
                        throw new ClassNotFoundException(sb3.toString(), e3);
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                pN.MenuHostHelper$$ExternalSyntheticLambda0(newInstance4, "");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    oYVar = (oY) newInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = oY.class.getClassLoader();
                    if (pN.MenuHostHelper$$ExternalSyntheticLambda0(classLoader7, classLoader8)) {
                        throw e4;
                    }
                    StringBuilder sb4 = new StringBuilder("Instance class was loaded from a different classloader: ");
                    sb4.append(classLoader7);
                    sb4.append(", base type classloader: ");
                    sb4.append(classLoader8);
                    throw new ClassNotFoundException(sb4.toString(), e4);
                }
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            oYVar = (oY) newInstance2;
            setX = oYVar;
        }
        oYVar = new oY();
        setX = oYVar;
    }

    private static final int MenuHostHelper$$ExternalSyntheticLambda0() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        String str = property;
        int x = qR.setX((CharSequence) str, '.', 0, false);
        if (x < 0) {
            try {
                return Integer.parseInt(property) << 16;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i = x + 1;
        int x2 = qR.setX((CharSequence) str, '.', i, false);
        if (x2 < 0) {
            x2 = property.length();
        }
        String substring = property.substring(0, x);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
        String substring2 = property.substring(i, x2);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring2, "");
        try {
            return (Integer.parseInt(substring) << 16) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}