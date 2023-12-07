package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import o.AbstractC0315nc;

/* loaded from: classes.dex */
final class mF extends AbstractC0315nc {
    private AssetManager MenuHostHelper$$ExternalSyntheticLambda0;
    private final Context MenuHostHelper$$ExternalSyntheticLambda1;
    private final Object setIconTintList = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public mF(Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
    }

    @Override // o.AbstractC0315nc
    public final boolean setY(mY mYVar) {
        Uri uri = mYVar.setZ;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // o.AbstractC0315nc
    public final AbstractC0315nc.setX MenuHostHelper$$ExternalSyntheticLambda0(mY mYVar, int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            synchronized (this.setIconTintList) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.getAssets();
                }
            }
        }
        return new AbstractC0315nc.setX(C0615xz.setY(this.MenuHostHelper$$ExternalSyntheticLambda0.open(mYVar.setZ.toString().substring(22))), mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK);
    }
}