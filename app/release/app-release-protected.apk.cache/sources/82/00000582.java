package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class hN extends hJ {
    private static Class MenuHostHelper$$ExternalSyntheticLambda0;
    private final Object setX = setY();
    private final Field setIconTintList = MenuHostHelper$$ExternalSyntheticLambda0();

    @Override // o.hJ
    public final void setIconTintList(AccessibleObject accessibleObject) {
        if (setY(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            StringBuilder sb = new StringBuilder("Gson couldn't modify fields for ");
            sb.append(accessibleObject);
            sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
            throw new gY(sb.toString(), e);
        }
    }

    private boolean setY(AccessibleObject accessibleObject) {
        if (this.setX != null && this.setIconTintList != null) {
            try {
                MenuHostHelper$$ExternalSyntheticLambda0.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.setX, accessibleObject, Long.valueOf(((Long) MenuHostHelper$$ExternalSyntheticLambda0.getMethod("objectFieldOffset", Field.class).invoke(this.setX, this.setIconTintList)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Object setY() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            MenuHostHelper$$ExternalSyntheticLambda0 = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Field MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}