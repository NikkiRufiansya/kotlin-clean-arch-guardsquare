package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public final class setCompatPressedTranslationZ {
    private static final ThreadLocal<TypedValue> setLayoutAnimation = new ThreadLocal<>();
    static final int[] setIconTintList = {-16842910};
    static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {16842908};
    static final int[] setX = {16842919};
    static final int[] setY = {16842912};
    static final int[] MenuHostHelper$$ExternalSyntheticLambda0 = new int[0];
    private static final int[] setNavigationOnClickListener = new int[1];

    public static int setIconTintList(Context context, int i) {
        int[] iArr = setNavigationOnClickListener;
        iArr[0] = i;
        setExpandedHintEnabled x = setExpandedHintEnabled.setX(context, (AttributeSet) null, iArr);
        try {
            return x.setIconTintList(0);
        } finally {
            x.setX();
        }
    }

    public static ColorStateList MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        int[] iArr = setNavigationOnClickListener;
        iArr[0] = i;
        setExpandedHintEnabled x = setExpandedHintEnabled.setX(context, (AttributeSet) null, iArr);
        try {
            return x.setY(0);
        } finally {
            x.setX();
        }
    }

    public static int setX(Context context, int i) {
        ColorStateList MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(context, i);
        if (MenuHostHelper$$ExternalSyntheticLambda02 != null && MenuHostHelper$$ExternalSyntheticLambda02.isStateful()) {
            return MenuHostHelper$$ExternalSyntheticLambda02.getColorForState(setIconTintList, MenuHostHelper$$ExternalSyntheticLambda02.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = setLayoutAnimation;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int iconTintList = setIconTintList(context, i);
        return setExtended.setIconTintList(iconTintList, Math.round(Color.alpha(iconTintList) * f));
    }

    public static void setIconTintList(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(setAnimationFromJson.setY.minusKey);
        try {
            if (!obtainStyledAttributes.hasValue(setAnimationFromJson.setY.setCheckedIconEnabledResource)) {
                StringBuilder sb = new StringBuilder("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}