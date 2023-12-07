package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import o.setTitleMarginBottom;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(setTitleMarginBottom settitlemarginbottom) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.ViewPager$SavedState$1 = settitlemarginbottom.setY(iconCompat.ViewPager$SavedState$1, 1);
        iconCompat.setX = settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.setX);
        iconCompat.setNavigationOnClickListener = settitlemarginbottom.setX((setTitleMarginBottom) iconCompat.setNavigationOnClickListener, 3);
        iconCompat.setY = settitlemarginbottom.setY(iconCompat.setY, 4);
        iconCompat.setIconTintList = settitlemarginbottom.setY(iconCompat.setIconTintList, 5);
        iconCompat.setUiOptions = (ColorStateList) settitlemarginbottom.setX((setTitleMarginBottom) iconCompat.setUiOptions, 6);
        iconCompat.setOnLongClickListener = settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.setOnLongClickListener, 7);
        iconCompat.setUnboundedRipple = settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.setUnboundedRipple, 8);
        iconCompat.MenuHostHelper$$ExternalSyntheticLambda1();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, setTitleMarginBottom settitlemarginbottom) {
        iconCompat.MenuHostHelper$$ExternalSyntheticLambda0(setTitleMarginBottom.MenuHostHelper$$ExternalSyntheticLambda0());
        if (-1 != iconCompat.ViewPager$SavedState$1) {
            settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.ViewPager$SavedState$1, 1);
        }
        if (iconCompat.setX != null) {
            settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda1(iconCompat.setX);
        }
        if (iconCompat.setNavigationOnClickListener != null) {
            settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.setNavigationOnClickListener, 3);
        }
        if (iconCompat.setY != 0) {
            settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.setY, 4);
        }
        if (iconCompat.setIconTintList != 0) {
            settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.setIconTintList, 5);
        }
        if (iconCompat.setUiOptions != null) {
            settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(iconCompat.setUiOptions, 6);
        }
        if (iconCompat.setOnLongClickListener != null) {
            settitlemarginbottom.setX(iconCompat.setOnLongClickListener, 7);
        }
        if (iconCompat.setUnboundedRipple != null) {
            settitlemarginbottom.setX(iconCompat.setUnboundedRipple, 8);
        }
    }
}