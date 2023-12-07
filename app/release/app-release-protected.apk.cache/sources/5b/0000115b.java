package o;

/* renamed from: o.ti  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483ti<T> {
    private final Object setY;
    public static final ti$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = new ti$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    private static final setX MenuHostHelper$$ExternalSyntheticLambda0 = new setX();

    /* renamed from: o.ti$setX */
    /* loaded from: classes.dex */
    public static class setX {
        public String toString() {
            return "Failed";
        }
    }

    public static final /* synthetic */ C0483ti MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        return new C0483ti(obj);
    }

    public static <T> Object setX(Object obj) {
        return obj;
    }

    private /* synthetic */ C0483ti(Object obj) {
        this.setY = obj;
    }

    public static final boolean setIconTintList(Object obj) {
        return !(obj instanceof setX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T setY(Object obj) {
        if (obj instanceof setX) {
            return null;
        }
        return obj;
    }

    public static final Throwable MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        ti$MenuHostHelper$$ExternalSyntheticLambda0 ti_menuhosthelper__externalsyntheticlambda0 = obj instanceof ti$MenuHostHelper$$ExternalSyntheticLambda0 ? (ti$MenuHostHelper$$ExternalSyntheticLambda0) obj : null;
        if (ti_menuhosthelper__externalsyntheticlambda0 != null) {
            return ti_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return null;
    }

    public final String toString() {
        Object obj = this.setY;
        if (obj instanceof ti$MenuHostHelper$$ExternalSyntheticLambda0) {
            return ((ti$MenuHostHelper$$ExternalSyntheticLambda0) obj).toString();
        }
        StringBuilder sb = new StringBuilder("Value(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0483ti) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, ((C0483ti) obj).setY);
    }

    public final int hashCode() {
        Object obj = this.setY;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}