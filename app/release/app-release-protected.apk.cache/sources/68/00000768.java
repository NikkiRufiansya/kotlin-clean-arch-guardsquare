package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;

/* renamed from: o.nc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0315nc {
    public abstract setX MenuHostHelper$$ExternalSyntheticLambda0(mY mYVar, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean MenuHostHelper$$ExternalSyntheticLambda1(NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setIconTintList() {
        return 0;
    }

    public abstract boolean setY(mY mYVar);

    /* renamed from: o.nc$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        final mU$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
        final Bitmap MenuHostHelper$$ExternalSyntheticLambda1;
        final int setX;
        final xJ setY;

        public setX(Bitmap bitmap, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1) {
            this((Bitmap) C0321ni.setY(bitmap, "bitmap == null"), null, mu_menuhosthelper__externalsyntheticlambda1, 0);
        }

        public setX(xJ xJVar, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1) {
            this(null, (xJ) C0321ni.setY(xJVar, "source == null"), mu_menuhosthelper__externalsyntheticlambda1, 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(Bitmap bitmap, xJ xJVar, mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1, int i) {
            if ((bitmap != null) == (xJVar != null)) {
                throw new AssertionError();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = bitmap;
            this.setY = xJVar;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = (mU$MenuHostHelper$$ExternalSyntheticLambda1) C0321ni.setY(mu_menuhosthelper__externalsyntheticlambda1, "loadedFrom == null");
            this.setX = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3, int i4, BitmapFactory.Options options, mY mYVar) {
        int min;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                int floor2 = (int) Math.floor(i4 / i2);
                int floor3 = (int) Math.floor(i3 / i);
                if (mYVar.setY) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BitmapFactory.Options MenuHostHelper$$ExternalSyntheticLambda1(mY mYVar) {
        boolean z = (mYVar.setMaxEms == 0 && mYVar.setOnNavigationItemSelectedListener == 0) ? false : true;
        boolean z2 = mYVar.setIconTintList != null;
        if (z || z2 || mYVar.setUnboundedRipple) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = z;
            options.inInputShareable = mYVar.setUnboundedRipple;
            options.inPurgeable = mYVar.setUnboundedRipple;
            if (z2) {
                options.inPreferredConfig = mYVar.setIconTintList;
            }
            return options;
        }
        return null;
    }
}