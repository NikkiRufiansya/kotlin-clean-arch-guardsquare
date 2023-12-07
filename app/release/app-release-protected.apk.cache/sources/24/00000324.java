package o;

import java.util.Map;

/* renamed from: o.bq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056bq {
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    public final Map<Class<?>, Object> setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C0056bq(String str, Map map, byte b) {
        this(str, map);
    }

    public C0056bq(String str, Map<Class<?>, Object> map) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setY = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0056bq) {
            C0056bq c0056bq = (C0056bq) obj;
            return this.MenuHostHelper$$ExternalSyntheticLambda1.equals(c0056bq.MenuHostHelper$$ExternalSyntheticLambda1) && this.setY.equals(c0056bq.setY);
        }
        return false;
    }

    public final int hashCode() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode() * 31) + this.setY.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldDescriptor{name=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", properties=");
        sb.append(this.setY.values());
        sb.append("}");
        return sb.toString();
    }
}