package o;

/* loaded from: classes.dex */
public final class nB {
    public static <T> void setIconTintList(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}