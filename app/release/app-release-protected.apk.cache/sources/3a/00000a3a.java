package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class setChipText {
    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
    private static final int[] setOnLongClickListener = {16842919};
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {16843623, 16842908};
    private static final int[] setIconTintList = {16842908};
    private static final int[] setX = {16843623};
    private static final int[] setChipCornerRadius = {16842913, 16842919};
    private static final int[] setLayoutAnimation = {16842913, 16843623, 16842908};
    private static final int[] setUiOptions = {16842913, 16842908};
    private static final int[] setNavigationOnClickListener = {16842913, 16843623};
    private static final int[] setTextAlignment = {16842913};
    private static final int[] setY = {16842910, 16842919};
    private static String setUnboundedRipple = "RippleUtils";

    public static ColorStateList setX(ColorStateList colorStateList) {
        if (MenuHostHelper$$ExternalSyntheticLambda0) {
            int[] iArr = setIconTintList;
            return new ColorStateList(new int[][]{setTextAlignment, iArr, StateSet.NOTHING}, new int[]{setY(colorStateList, setChipCornerRadius), setY(colorStateList, iArr), setY(colorStateList, setOnLongClickListener)});
        }
        int[] iArr2 = setChipCornerRadius;
        int[] iArr3 = setLayoutAnimation;
        int[] iArr4 = setUiOptions;
        int[] iArr5 = setNavigationOnClickListener;
        int[] iArr6 = setOnLongClickListener;
        int[] iArr7 = MenuHostHelper$$ExternalSyntheticLambda1;
        int[] iArr8 = setIconTintList;
        int[] iArr9 = setX;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, setTextAlignment, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{setY(colorStateList, iArr2), setY(colorStateList, iArr3), setY(colorStateList, iArr4), setY(colorStateList, iArr5), 0, setY(colorStateList, iArr6), setY(colorStateList, iArr7), setY(colorStateList, iArr8), setY(colorStateList, iArr9), 0});
    }

    public static ColorStateList setY(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(setY, 0)) != 0) {
                Log.w(setUnboundedRipple, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    private static int setY(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return MenuHostHelper$$ExternalSyntheticLambda0 ? setExtended.setIconTintList(colorForState, Math.min(Color.alpha(colorForState) << 1, 255)) : colorForState;
    }

    public static Drawable setX(Context context, int i) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.res_0x7f0400e4, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue == null) {
            colorStateList = null;
        } else if (typedValue.resourceId != 0) {
            colorStateList = setLineHeight.setIconTintList(context, typedValue.resourceId);
        } else {
            colorStateList = ColorStateList.valueOf(typedValue.data);
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, null, insetDrawable);
    }
}