package o;

import o.aL;

/* renamed from: o.ay  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037ay {
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    public final aL<?> MenuHostHelper$$ExternalSyntheticLambda1;
    final int setX;

    public C0037ay(aL<?> aLVar, int i, int i2) {
        if (aLVar != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = aLVar;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.setX = i2;
            return;
        }
        throw new NullPointerException("Null dependency anInterface.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0037ay) {
            C0037ay c0037ay = (C0037ay) obj;
            return this.MenuHostHelper$$ExternalSyntheticLambda1.equals(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1) && this.MenuHostHelper$$ExternalSyntheticLambda0 == c0037ay.MenuHostHelper$$ExternalSyntheticLambda0 && this.setX == c0037ay.setX;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode() ^ 1000003) * 1000003) ^ this.MenuHostHelper$$ExternalSyntheticLambda0) * 1000003) ^ this.setX;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", type=");
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.setX;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else if (i2 != 2) {
            StringBuilder sb2 = new StringBuilder("Unsupported injection: ");
            sb2.append(i2);
            throw new AssertionError(sb2.toString());
        } else {
            str = "deferred";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public C0037ay(Class<?> cls, int i, int i2) {
        this(new aL(aL.setX.class, cls), i, i2);
    }
}