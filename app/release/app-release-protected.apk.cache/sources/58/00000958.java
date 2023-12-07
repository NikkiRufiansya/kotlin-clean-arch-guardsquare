package o;

import android.content.Context;

/* loaded from: classes.dex */
public final class setAnimationMatrix implements setTag<String> {
    private final nF<Context> setY;

    public setAnimationMatrix(nF<Context> nFVar) {
        this.setY = nFVar;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        String packageName = this.setY.setIconTintList().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}