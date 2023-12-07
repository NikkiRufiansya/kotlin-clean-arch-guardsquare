package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import o.mU;
import o.mY;

/* loaded from: classes.dex */
public final class mX {
    private static final AtomicInteger setY = new AtomicInteger();
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    Object MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean ViewPager$SavedState$1;
    private int setChipCornerRadius;
    final mY.setY setIconTintList;
    private int setLayoutAnimation;
    private int setNavigationOnClickListener;
    private boolean setOnLongClickListener;
    private Drawable setTextAlignment;
    private int setUiOptions;
    private final mU setUnboundedRipple;
    private Drawable setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mX(mU mUVar, Uri uri) {
        this.ViewPager$SavedState$1 = true;
        boolean z = mUVar.setLayoutAnimation;
        this.setUnboundedRipple = mUVar;
        this.setIconTintList = new mY.setY(uri, 0, mUVar.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    mX() {
        this.ViewPager$SavedState$1 = true;
        this.setUnboundedRipple = null;
        this.setIconTintList = new mY.setY(null, 0, null);
    }

    public final void setX(ImageView imageView, mG mGVar) {
        Bitmap MenuHostHelper$$ExternalSyntheticLambda1;
        long nanoTime = System.nanoTime();
        C0321ni.setIconTintList();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        mY.setY sety = this.setIconTintList;
        if (!((sety.setAnimationFromJson == null && sety.setUnboundedRipple == 0) ? false : true)) {
            mU mUVar = this.setUnboundedRipple;
            if (imageView == null) {
                throw new IllegalArgumentException("view cannot be null.");
            }
            mUVar.MenuHostHelper$$ExternalSyntheticLambda1(imageView);
            if (this.ViewPager$SavedState$1) {
                C0313na.MenuHostHelper$$ExternalSyntheticLambda1(imageView, this.setTextAlignment);
                return;
            }
            return;
        }
        mY x = setX(nanoTime);
        String MenuHostHelper$$ExternalSyntheticLambda12 = C0321ni.MenuHostHelper$$ExternalSyntheticLambda1(x);
        if (mT.setY(this.setUiOptions) && (MenuHostHelper$$ExternalSyntheticLambda1 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda12)) != null) {
            mU mUVar2 = this.setUnboundedRipple;
            if (imageView == null) {
                throw new IllegalArgumentException("view cannot be null.");
            }
            mUVar2.MenuHostHelper$$ExternalSyntheticLambda1(imageView);
            C0313na.setIconTintList(imageView, this.setUnboundedRipple.setIconTintList, MenuHostHelper$$ExternalSyntheticLambda1, mU$MenuHostHelper$$ExternalSyntheticLambda1.MEMORY, this.setOnLongClickListener, this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0);
            if (this.setUnboundedRipple.setOnLongClickListener) {
                StringBuilder sb = new StringBuilder("[R");
                sb.append(x.setUiOptions);
                sb.append(']');
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder("from ");
                sb2.append(mU$MenuHostHelper$$ExternalSyntheticLambda1.MEMORY);
                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Main", "completed", obj, sb2.toString());
                return;
            }
            return;
        }
        if (this.ViewPager$SavedState$1) {
            C0313na.MenuHostHelper$$ExternalSyntheticLambda1(imageView, this.setTextAlignment);
        }
        this.setUnboundedRipple.setX(new mR(this.setUnboundedRipple, imageView, x, this.setUiOptions, this.setNavigationOnClickListener, this.setLayoutAnimation, this.setX, MenuHostHelper$$ExternalSyntheticLambda12, this.MenuHostHelper$$ExternalSyntheticLambda1, mGVar, this.setOnLongClickListener));
    }

    private mY setX(long j) {
        int andIncrement = setY.getAndIncrement();
        mY.setY sety = this.setIconTintList;
        boolean z = sety.setIconTintList;
        boolean z2 = sety.MenuHostHelper$$ExternalSyntheticLambda1;
        if (sety.setNavigationOnClickListener == null) {
            sety.setNavigationOnClickListener = mU.setY.NORMAL;
        }
        mY mYVar = new mY(sety.setAnimationFromJson, sety.setUnboundedRipple, sety.setChipCornerRadius, sety.setOnNavigationItemSelectedListener, sety.ViewPager$SavedState$1, sety.setCenterIfNoTextEnabled, sety.MenuHostHelper$$ExternalSyntheticLambda1, sety.setIconTintList, sety.MenuHostHelper$$ExternalSyntheticLambda0, sety.setLayoutAnimation, sety.setOnLongClickListener, sety.setTextAlignment, sety.setIconSize, sety.setX, sety.setUiOptions, sety.setY, sety.setNavigationOnClickListener, (byte) 0);
        mYVar.setUiOptions = andIncrement;
        mYVar.setTextScaleX = j;
        boolean z3 = this.setUnboundedRipple.setOnLongClickListener;
        if (z3) {
            StringBuilder sb = new StringBuilder("[R");
            sb.append(mYVar.setUiOptions);
            sb.append(']');
            C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Main", "created", sb.toString(), mYVar.toString());
        }
        mU mUVar = this.setUnboundedRipple;
        mY MenuHostHelper$$ExternalSyntheticLambda1 = mUVar.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(mYVar);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            StringBuilder sb2 = new StringBuilder("Request transformer ");
            sb2.append(mUVar.setNavigationOnClickListener.getClass().getCanonicalName());
            sb2.append(" returned null for ");
            sb2.append(mYVar);
            throw new IllegalStateException(sb2.toString());
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1 != mYVar) {
            MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions = andIncrement;
            MenuHostHelper$$ExternalSyntheticLambda1.setTextScaleX = j;
            if (z3) {
                String iconTintList = MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
                StringBuilder sb3 = new StringBuilder("into ");
                sb3.append(MenuHostHelper$$ExternalSyntheticLambda1);
                C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Main", "changed", iconTintList, sb3.toString());
            }
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }
}