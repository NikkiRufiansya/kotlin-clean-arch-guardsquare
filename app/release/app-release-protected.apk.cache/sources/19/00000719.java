package o;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.mU;

/* loaded from: classes.dex */
public final class mY {
    private static final long setTextAppearanceResource = TimeUnit.SECONDS.toNanos(5);
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public final int MenuHostHelper$$ExternalSyntheticLambda1;
    public final int ViewPager$SavedState$1;
    public final List<InterfaceC0319ng> setAnimationFromJson;
    public final float setCenterIfNoTextEnabled;
    public final float setChipCornerRadius;
    public final String setIconSize;
    public final Bitmap.Config setIconTintList;
    public final boolean setLayoutAnimation;
    public final int setMaxEms;
    int setNavigationOnClickListener;
    public final mU.setY setOnLongClickListener;
    public final int setOnNavigationItemSelectedListener;
    public final float setTextAlignment;
    long setTextScaleX;
    int setUiOptions;
    public final boolean setUnboundedRipple;
    public final boolean setX;
    public final boolean setY;
    public final Uri setZ;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ mY(Uri uri, int i, String str, List list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, mU.setY sety, byte b) {
        this(uri, i, str, list, i2, i3, z, z2, i4, z3, f, f2, f3, z4, z5, config, sety);
    }

    private mY(Uri uri, int i, String str, List<InterfaceC0319ng> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, mU.setY sety) {
        this.setZ = uri;
        this.ViewPager$SavedState$1 = i;
        this.setIconSize = str;
        if (list == null) {
            this.setAnimationFromJson = null;
        } else {
            this.setAnimationFromJson = Collections.unmodifiableList(list);
        }
        this.setMaxEms = i2;
        this.setOnNavigationItemSelectedListener = i3;
        this.setX = z;
        this.setY = z2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i4;
        this.setLayoutAnimation = z3;
        this.setTextAlignment = f;
        this.setChipCornerRadius = f2;
        this.setCenterIfNoTextEnabled = f3;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z4;
        this.setUnboundedRipple = z5;
        this.setIconTintList = config;
        this.setOnLongClickListener = sety;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.ViewPager$SavedState$1;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.setZ);
        }
        List<InterfaceC0319ng> list = this.setAnimationFromJson;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC0319ng interfaceC0319ng : this.setAnimationFromJson) {
                sb.append(' ');
                sb.append(interfaceC0319ng.setX());
            }
        }
        if (this.setIconSize != null) {
            sb.append(" stableKey(");
            sb.append(this.setIconSize);
            sb.append(')');
        }
        if (this.setMaxEms > 0) {
            sb.append(" resize(");
            sb.append(this.setMaxEms);
            sb.append(',');
            sb.append(this.setOnNavigationItemSelectedListener);
            sb.append(')');
        }
        if (this.setX) {
            sb.append(" centerCrop");
        }
        if (this.setY) {
            sb.append(" centerInside");
        }
        if (this.setTextAlignment != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.setTextAlignment);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                sb.append(" @ ");
                sb.append(this.setChipCornerRadius);
                sb.append(',');
                sb.append(this.setCenterIfNoTextEnabled);
            }
            sb.append(')');
        }
        if (this.setUnboundedRipple) {
            sb.append(" purgeable");
        }
        if (this.setIconTintList != null) {
            sb.append(' ');
            sb.append(this.setIconTintList);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String setIconTintList() {
        long nanoTime = System.nanoTime() - this.setTextScaleX;
        if (nanoTime > setTextAppearanceResource) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("[R");
            sb2.append(this.setUiOptions);
            sb2.append(']');
            sb.append(sb2.toString());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder("[R");
        sb4.append(this.setUiOptions);
        sb4.append(']');
        sb3.append(sb4.toString());
        sb3.append('+');
        sb3.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb3.append("ms");
        return sb3.toString();
    }

    /* loaded from: classes.dex */
    public static final class setY {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        int ViewPager$SavedState$1;
        Uri setAnimationFromJson;
        int setCenterIfNoTextEnabled;
        String setChipCornerRadius;
        float setIconSize;
        boolean setIconTintList;
        boolean setLayoutAnimation;
        mU.setY setNavigationOnClickListener;
        float setOnLongClickListener;
        List<InterfaceC0319ng> setOnNavigationItemSelectedListener;
        float setTextAlignment;
        boolean setUiOptions;
        int setUnboundedRipple = 0;
        boolean setX;
        Bitmap.Config setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(Uri uri, int i, Bitmap.Config config) {
            this.setAnimationFromJson = uri;
            this.setY = config;
        }
    }
}