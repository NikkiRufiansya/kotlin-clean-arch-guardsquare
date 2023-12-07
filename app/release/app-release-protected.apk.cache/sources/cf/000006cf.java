package o;

import android.content.Context;

/* renamed from: o.lr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278lr implements InterfaceC0336nx<com.rmldemo.guardsquare.data.local.AppDatabase> {
    private final C0275lo setIconTintList;
    private final nF<Context> setX;

    public C0278lr(C0275lo c0275lo, nF<Context> nFVar) {
        this.setIconTintList = c0275lo;
        this.setX = nFVar;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        com.rmldemo.guardsquare.data.local.AppDatabase MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(this.setX.setIconTintList());
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda1;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}