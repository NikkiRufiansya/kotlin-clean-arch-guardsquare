package o;

import java.math.BigDecimal;

/* renamed from: o.ho  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216ho extends Number {
    private final String setIconTintList;

    public C0216ho(String str) {
        this.setIconTintList = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.setIconTintList);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.setIconTintList).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.setIconTintList);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.setIconTintList);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.setIconTintList).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.setIconTintList);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.setIconTintList);
    }

    public final String toString() {
        return this.setIconTintList;
    }

    private Object writeReplace() {
        return new BigDecimal(this.setIconTintList);
    }

    public final int hashCode() {
        return this.setIconTintList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0216ho) {
            String str = this.setIconTintList;
            String str2 = ((C0216ho) obj).setIconTintList;
            return str == str2 || str.equals(str2);
        }
        return false;
    }
}