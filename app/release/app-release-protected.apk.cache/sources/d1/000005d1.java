package o;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: o.hu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0222hu {
    public abstract <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls);

    public static AbstractC0222hu MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new AbstractC0222hu() { // from class: o.hu.4
                @Override // o.AbstractC0222hu
                public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls2) {
                    setIconTintList(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new AbstractC0222hu() { // from class: o.hu.5
                        @Override // o.AbstractC0222hu
                        public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls2) {
                            setIconTintList(cls2);
                            return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(intValue));
                        }
                    };
                } catch (Exception unused2) {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new AbstractC0222hu() { // from class: o.hu.2
                        @Override // o.AbstractC0222hu
                        public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls2) {
                            setIconTintList(cls2);
                            return (T) declaredMethod3.invoke(null, cls2, Object.class);
                        }
                    };
                }
            } catch (Exception unused3) {
                return new AbstractC0222hu() { // from class: o.hu.1
                    @Override // o.AbstractC0222hu
                    public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls2) {
                        StringBuilder sb = new StringBuilder("Cannot allocate ");
                        sb.append(cls2);
                        throw new UnsupportedOperationException(sb.toString());
                    }
                };
            }
        }
    }

    static void setIconTintList(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }
}