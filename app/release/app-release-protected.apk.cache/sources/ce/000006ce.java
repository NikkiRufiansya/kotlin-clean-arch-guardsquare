package o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.lq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277lq implements InterfaceC0336nx<SharedPreferences> {
    private final nF<Context> MenuHostHelper$$ExternalSyntheticLambda1;
    private final C0275lo setX;

    public C0277lq(C0275lo c0275lo, nF<Context> nFVar) {
        this.setX = c0275lo;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = nFVar;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        SharedPreferences x = this.setX.setX(this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList());
        if (x != null) {
            return x;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}