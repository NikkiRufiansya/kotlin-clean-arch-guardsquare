package o;

import android.content.Context;
import o.AbstractC0315nc;

/* loaded from: classes.dex */
final class mO extends mK {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mO(Context context) {
        super(context);
    }

    @Override // o.mK, o.AbstractC0315nc
    public final boolean setY(mY mYVar) {
        return "file".equals(mYVar.setZ.getScheme());
    }

    @Override // o.mK, o.AbstractC0315nc
    public final AbstractC0315nc.setX MenuHostHelper$$ExternalSyntheticLambda0(mY mYVar, int i) {
        return new AbstractC0315nc.setX(null, C0615xz.setY(this.setX.getContentResolver().openInputStream(mYVar.setZ)), mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK, new Counter$1(mYVar.setZ.getPath()).MenuHostHelper$$ExternalSyntheticLambda0("Orientation"));
    }
}