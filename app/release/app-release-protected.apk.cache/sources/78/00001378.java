package o;

import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: o.yf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622yf<T> {
    @Nullable
    private final vH MenuHostHelper$$ExternalSyntheticLambda1;
    public final vJ setX;
    @Nullable
    public final T setY;

    public static <T> C0622yf<T> MenuHostHelper$$ExternalSyntheticLambda0(@Nullable T t, vJ vJVar) {
        Objects.requireNonNull(vJVar, "rawResponse == null");
        int i = vJVar.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(200 <= i && 299 >= i)) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new C0622yf<>(vJVar, t, null);
    }

    public static <T> C0622yf<T> setIconTintList(vH vHVar, vJ vJVar) {
        Objects.requireNonNull(vHVar, "body == null");
        Objects.requireNonNull(vJVar, "rawResponse == null");
        int i = vJVar.MenuHostHelper$$ExternalSyntheticLambda0;
        if (200 <= i && 299 >= i) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C0622yf<>(vJVar, null, vHVar);
    }

    private C0622yf(vJ vJVar, @Nullable T t, @Nullable vH vHVar) {
        this.setX = vJVar;
        this.setY = t;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = vHVar;
    }

    public final String toString() {
        return this.setX.toString();
    }
}