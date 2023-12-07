package o;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver {

    /* loaded from: classes.dex */
    public static class setY {
        public void setX(int i) {
        }

        public void setX(Typeface typeface) {
        }
    }

    public static Typeface MenuHostHelper$$ExternalSyntheticLambda1(Context context, CancellationSignal cancellationSignal, setX[] setxArr) {
        Typeface x;
        x = copyRootViewBounds.setY.setX(context, cancellationSignal, setxArr, 0);
        return x;
    }

    public static SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0(Context context, CancellationSignal cancellationSignal, setMarqueeRepeatLimit setmarqueerepeatlimit) {
        return setOnFitSystemWindowsListener.setIconTintList(context, setmarqueerepeatlimit, cancellationSignal);
    }

    public static Typeface setY(Context context, setMarqueeRepeatLimit setmarqueerepeatlimit, int i, boolean z, int i2, Handler handler, setY sety) {
        setEmptyVisibility setemptyvisibility = new setEmptyVisibility(sety, handler);
        if (z) {
            return setChipCornerRadiusResource.setIconTintList(context, setmarqueerepeatlimit, setemptyvisibility, i, i2);
        }
        return setChipCornerRadiusResource.setY(context, setmarqueerepeatlimit, i, setemptyvisibility);
    }

    /* loaded from: classes.dex */
    public static class setX {
        private final Uri MenuHostHelper$$ExternalSyntheticLambda0;
        private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;
        private final int setX;
        private final int setY;

        @Deprecated
        public setX(Uri uri, int i, int i2, boolean z, int i3) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = uri;
            this.setY = i;
            this.setIconTintList = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
            this.setX = i3;
        }

        public static setX MenuHostHelper$$ExternalSyntheticLambda1(Uri uri, int i, int i2, boolean z, int i3) {
            return new setX(uri, i, i2, z, i3);
        }

        public Uri setIconTintList() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public int setY() {
            return this.setY;
        }

        public int setX() {
            return this.setIconTintList;
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public int MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setX;
        }
    }
}