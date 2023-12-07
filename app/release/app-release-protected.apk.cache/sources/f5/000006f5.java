package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class mH<T> {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final int MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setCenterIfNoTextEnabled;
    final WeakReference<T> setIconSize;
    final int setIconTintList;
    final boolean setLayoutAnimation;
    final Object setNavigationOnClickListener;
    final mY setOnLongClickListener;
    final int setUiOptions;
    final mU setUnboundedRipple;
    final Drawable setX;
    final String setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(Bitmap bitmap, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setY();

    /* JADX INFO: Access modifiers changed from: package-private */
    public mH(mU mUVar, T t, mY mYVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        this.setUnboundedRipple = mUVar;
        this.setOnLongClickListener = mYVar;
        this.setIconSize = t == null ? null : new mH$MenuHostHelper$$ExternalSyntheticLambda1(this, t, mUVar.setUiOptions);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setUiOptions = i2;
        this.setLayoutAnimation = z;
        this.setIconTintList = i3;
        this.setX = drawable;
        this.setY = str;
        this.setNavigationOnClickListener = obj == null ? this : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }
}