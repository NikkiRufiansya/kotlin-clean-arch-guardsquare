package o;

import android.content.Context;

/* loaded from: classes.dex */
final class setCloseIconEnabled extends isConsumed {
    private final setSearchableInfo MenuHostHelper$$ExternalSyntheticLambda0;
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final setSearchableInfo setIconTintList;
    private final Context setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCloseIconEnabled(Context context, setSearchableInfo setsearchableinfo, setSearchableInfo setsearchableinfo2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.setY = context;
        if (setsearchableinfo == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.setIconTintList = setsearchableinfo;
        if (setsearchableinfo2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setsearchableinfo2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
    }

    @Override // o.isConsumed
    public final Context MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    @Override // o.isConsumed
    public final setSearchableInfo setX() {
        return this.setIconTintList;
    }

    @Override // o.isConsumed
    public final setSearchableInfo setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.isConsumed
    public final String setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.setY);
        sb.append(", wallClock=");
        sb.append(this.setIconTintList);
        sb.append(", monotonicClock=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", backendName=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof isConsumed) {
            isConsumed isconsumed = (isConsumed) obj;
            return this.setY.equals(isconsumed.MenuHostHelper$$ExternalSyntheticLambda0()) && this.setIconTintList.equals(isconsumed.setX()) && this.MenuHostHelper$$ExternalSyntheticLambda0.equals(isconsumed.setY()) && this.MenuHostHelper$$ExternalSyntheticLambda1.equals(isconsumed.setIconTintList());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.setY.hashCode();
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.setIconTintList.hashCode()) * 1000003) ^ this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) * 1000003) ^ this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }
}