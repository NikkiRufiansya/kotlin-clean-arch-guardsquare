package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class nR<T> implements Serializable {
    public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList((byte) 0);
    private final Object setX;

    public static <T> Object setX(Object obj) {
        return obj;
    }

    public final int hashCode() {
        return 0;
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        return !(obj instanceof setX);
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        return obj instanceof setX;
    }

    public static final Throwable setIconTintList(Object obj) {
        if (obj instanceof setX) {
            return ((setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
        }
    }

    /* loaded from: classes.dex */
    public static final class setX implements Serializable {
        public final Throwable MenuHostHelper$$ExternalSyntheticLambda0;

        public setX(Throwable th) {
            pN.setY((Object) th, "");
            this.MenuHostHelper$$ExternalSyntheticLambda0 = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof setX) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, ((setX) obj).MenuHostHelper$$ExternalSyntheticLambda0);
        }

        public final int hashCode() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append(')');
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nR) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) null, ((nR) obj).setX);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }
}