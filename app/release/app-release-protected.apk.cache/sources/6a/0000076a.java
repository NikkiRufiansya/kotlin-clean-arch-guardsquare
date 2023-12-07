package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import o.AbstractC0315nc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.nd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316nd extends AbstractC0315nc {
    private final Context setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0316nd(Context context) {
        this.setIconTintList = context;
    }

    @Override // o.AbstractC0315nc
    public final boolean setY(mY mYVar) {
        if (mYVar.ViewPager$SavedState$1 != 0) {
            return true;
        }
        return "android.resource".equals(mYVar.setZ.getScheme());
    }

    @Override // o.AbstractC0315nc
    public final AbstractC0315nc.setX MenuHostHelper$$ExternalSyntheticLambda0(mY mYVar, int i) {
        Resources MenuHostHelper$$ExternalSyntheticLambda1 = C0321ni.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, mYVar);
        return new AbstractC0315nc.setX(setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1, C0321ni.setY(MenuHostHelper$$ExternalSyntheticLambda1, mYVar), mYVar), mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK);
    }

    private static Bitmap setIconTintList(Resources resources, int i, mY mYVar) {
        BitmapFactory.Options MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(mYVar);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null && MenuHostHelper$$ExternalSyntheticLambda1.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, i, MenuHostHelper$$ExternalSyntheticLambda1);
            AbstractC0315nc.MenuHostHelper$$ExternalSyntheticLambda1(mYVar.setMaxEms, mYVar.setOnNavigationItemSelectedListener, MenuHostHelper$$ExternalSyntheticLambda1.outWidth, MenuHostHelper$$ExternalSyntheticLambda1.outHeight, MenuHostHelper$$ExternalSyntheticLambda1, mYVar);
        }
        return BitmapFactory.decodeResource(resources, i, MenuHostHelper$$ExternalSyntheticLambda1);
    }
}