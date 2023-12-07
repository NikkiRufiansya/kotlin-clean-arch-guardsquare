package o;

import java.math.BigInteger;

/* renamed from: o.ha  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202ha extends gV {
    private static final Class<?>[] setY = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    public Object MenuHostHelper$$ExternalSyntheticLambda0;

    public C0202ha(Boolean bool) {
        setY(bool);
    }

    public C0202ha(Number number) {
        setY(number);
    }

    public C0202ha(String str) {
        setY(str);
    }

    private void setY(Object obj) {
        if (obj instanceof Character) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || setIconTintList(obj)) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // o.gV
    public final Number MenuHostHelper$$ExternalSyntheticLambda0() {
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return obj instanceof String ? new C0216ho((String) obj) : (Number) obj;
    }

    private static boolean setIconTintList(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : setY) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return 31;
        }
        if (setX(this)) {
            doubleToLongBits = MenuHostHelper$$ExternalSyntheticLambda0().longValue();
        } else {
            Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(MenuHostHelper$$ExternalSyntheticLambda0().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0202ha c0202ha = (C0202ha) obj;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return c0202ha.MenuHostHelper$$ExternalSyntheticLambda0 == null;
        } else if (setX(this) && setX(c0202ha)) {
            return MenuHostHelper$$ExternalSyntheticLambda0().longValue() == c0202ha.MenuHostHelper$$ExternalSyntheticLambda0().longValue();
        } else {
            Object obj2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if ((obj2 instanceof Number) && (c0202ha.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Number)) {
                double doubleValue = MenuHostHelper$$ExternalSyntheticLambda0().doubleValue();
                double doubleValue2 = c0202ha.MenuHostHelper$$ExternalSyntheticLambda0().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(c0202ha.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    private static boolean setX(C0202ha c0202ha) {
        Object obj = c0202ha.MenuHostHelper$$ExternalSyntheticLambda0;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    @Override // o.gV
    public final boolean setIconTintList() {
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(setOnLongClickListener());
    }

    @Override // o.gV
    public final double setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Number ? MenuHostHelper$$ExternalSyntheticLambda0().doubleValue() : Double.parseDouble(setOnLongClickListener());
    }

    @Override // o.gV
    public final int setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Number ? MenuHostHelper$$ExternalSyntheticLambda0().intValue() : Integer.parseInt(setOnLongClickListener());
    }

    @Override // o.gV
    public final long MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Number ? MenuHostHelper$$ExternalSyntheticLambda0().longValue() : Long.parseLong(setOnLongClickListener());
    }

    @Override // o.gV
    public final String setOnLongClickListener() {
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (obj instanceof Number) {
            return MenuHostHelper$$ExternalSyntheticLambda0().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }
}