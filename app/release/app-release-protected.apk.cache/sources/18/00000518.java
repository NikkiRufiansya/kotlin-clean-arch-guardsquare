package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import o.setIconTint;

/* loaded from: classes.dex */
final class getTranslateY {
    final Rect MenuHostHelper$$ExternalSyntheticLambda0;
    private final ColorStateList MenuHostHelper$$ExternalSyntheticLambda1;
    private final int setIconTintList;
    private final ColorStateList setUiOptions;
    private final setScrollBarDefaultDelayBeforeFade setX;
    private final ColorStateList setY;

    private getTranslateY(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, Rect rect) {
        if (rect.left >= 0) {
            if (rect.top >= 0) {
                if (rect.right >= 0) {
                    if (rect.bottom >= 0) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = rect;
                        this.setUiOptions = colorStateList2;
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = colorStateList;
                        this.setY = colorStateList3;
                        this.setIconTintList = i;
                        this.setX = setscrollbardefaultdelaybeforefade;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getTranslateY MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, setIconTint.setIconTintList.setCheckedIconEnabled);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList x = setFastScrollEnabled.setX(context, obtainStyledAttributes, 4);
            ColorStateList x2 = setFastScrollEnabled.setX(context, obtainStyledAttributes, 9);
            ColorStateList x3 = setFastScrollEnabled.setX(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = new setScrollBarDefaultDelayBeforeFade(setScrollBarDefaultDelayBeforeFade.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new setActionBarVisibilityCallback(0.0f)), (byte) 0);
            obtainStyledAttributes.recycle();
            return new getTranslateY(x, x2, x3, dimensionPixelSize, setscrollbardefaultdelaybeforefade, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(TextView textView) {
        setWebViewClient setwebviewclient = new setWebViewClient();
        setWebViewClient setwebviewclient2 = new setWebViewClient();
        setwebviewclient.setShapeAppearanceModel(this.setX);
        setwebviewclient2.setShapeAppearanceModel(this.setX);
        ColorStateList colorStateList = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setwebviewclient.setChipIconTintResource.setX != colorStateList) {
            setwebviewclient.setChipIconTintResource.setX = colorStateList;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
        ColorStateList colorStateList2 = this.setY;
        setwebviewclient.setChipIconTintResource.setMaxEms = this.setIconTintList;
        setwebviewclient.invalidateSelf();
        if (setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener != colorStateList2) {
            setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener = colorStateList2;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
        textView.setTextColor(this.setUiOptions);
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(textView, new InsetDrawable((Drawable) new RippleDrawable(this.setUiOptions.withAlpha(30), setwebviewclient, setwebviewclient2), this.MenuHostHelper$$ExternalSyntheticLambda0.left, this.MenuHostHelper$$ExternalSyntheticLambda0.top, this.MenuHostHelper$$ExternalSyntheticLambda0.right, this.MenuHostHelper$$ExternalSyntheticLambda0.bottom));
    }
}