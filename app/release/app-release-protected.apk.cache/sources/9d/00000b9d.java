package o;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class setExpandedTitleMarginBottom {
    @EnsuresNonNull({"#1"})
    public static <T> T setX(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    public static <T> T setIconTintList(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}