package o;

/* renamed from: o.ui  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512ui {
    public static final void setX(int i) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected positive parallelism level, but got ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}