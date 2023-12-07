package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import java.util.Locale;
import o.setIconTint;

/* loaded from: classes.dex */
public final class setLeftTopRightBottom {
    public final setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
    public final setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    final float setIconTintList;
    final float setX;
    final float setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLeftTopRightBottom(Context context, int i, int i2, int i3, setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1 setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1) {
        AttributeSet attributeSet;
        int i4;
        CharSequence charSequence;
        int i5;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        Locale locale;
        Locale.Category category;
        setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1 setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12 = new setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12;
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1 == null ? new setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1() : setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1;
        int i6 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setLayoutAnimation;
        if (i6 != 0) {
            attributeSet = AppCompatSpinner$SavedState$1.setIconTintList(context, i6, "badge");
            i4 = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i4 = 0;
        }
        i3 = i4 != 0 ? i4 : i3;
        int[] iArr = setIconTint.setIconTintList.setY;
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context, attributeSet, i2, i3);
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context, attributeSet, iArr, i2, i3, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        Resources resources = context.getResources();
        this.setIconTintList = obtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.res_0x7f070198));
        this.setY = obtainStyledAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.res_0x7f070197));
        this.setX = obtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.res_0x7f07019d));
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 == -2 ? 255 : setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setNavigationOnClickListener == null) {
            charSequence = context.getString(R.string.res_0x7f140066);
        } else {
            charSequence = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setNavigationOnClickListener;
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setNavigationOnClickListener = charSequence;
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setUiOptions = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setUiOptions == 0 ? R.plurals.res_0x7f120000 : setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setUiOptions;
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setOnLongClickListener = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setOnLongClickListener == 0 ? R.string.res_0x7f140073 : setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setOnLongClickListener;
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.ViewPager$SavedState$1 = Boolean.valueOf(setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.ViewPager$SavedState$1 == null || setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.ViewPager$SavedState$1.booleanValue());
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setChipCornerRadius == -2) {
            i5 = obtainStyledAttributes.getInt(8, 4);
        } else {
            i5 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setChipCornerRadius;
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setChipCornerRadius = i5;
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setIconSize == -2) {
            if (obtainStyledAttributes.hasValue(9)) {
                setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setIconSize = obtainStyledAttributes.getInt(9, 0);
            } else {
                setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setIconSize = -1;
            }
        } else {
            setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setIconSize = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setIconSize;
        }
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setY != null) {
            intValue = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setY.intValue();
        } else {
            intValue = setFastScrollEnabled.setX(context, obtainStyledAttributes, 0).getDefaultColor();
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setY = Integer.valueOf(intValue);
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setUnboundedRipple == null) {
            if (obtainStyledAttributes.hasValue(3)) {
                setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setUnboundedRipple = Integer.valueOf(setFastScrollEnabled.setX(context, obtainStyledAttributes, 3).getDefaultColor());
            } else {
                setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setUnboundedRipple = Integer.valueOf(new setHeight(context, R.style._res_0x7f1501d4).setLayoutAnimation.getDefaultColor());
            }
        } else {
            setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setUnboundedRipple = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setUnboundedRipple;
        }
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setIconTintList == null) {
            intValue2 = obtainStyledAttributes.getInt(1, 8388661);
        } else {
            intValue2 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setIconTintList.intValue();
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setIconTintList = Integer.valueOf(intValue2);
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setCenterIfNoTextEnabled == null) {
            intValue3 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
        } else {
            intValue3 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setCenterIfNoTextEnabled.intValue();
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setCenterIfNoTextEnabled = Integer.valueOf(intValue3);
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setOnNavigationItemSelectedListener == null) {
            intValue4 = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
        } else {
            intValue4 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setOnNavigationItemSelectedListener.intValue();
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setOnNavigationItemSelectedListener = Integer.valueOf(intValue4);
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setTextAlignment == null) {
            intValue5 = obtainStyledAttributes.getDimensionPixelOffset(7, setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setCenterIfNoTextEnabled.intValue());
        } else {
            intValue5 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setTextAlignment.intValue();
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setTextAlignment = Integer.valueOf(intValue5);
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setAnimationFromJson == null) {
            intValue6 = obtainStyledAttributes.getDimensionPixelOffset(11, setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setOnNavigationItemSelectedListener.intValue());
        } else {
            intValue6 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setAnimationFromJson.intValue();
        }
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setAnimationFromJson = Integer.valueOf(intValue6);
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setX = Integer.valueOf(setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setX == null ? 0 : setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setX.intValue());
        setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 = Integer.valueOf(setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 != null ? setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1.intValue() : 0);
        obtainStyledAttributes.recycle();
        if (setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setTextScaleX == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setTextScaleX = locale;
        } else {
            setlefttoprightbottom_menuhosthelper__externalsyntheticlambda12.setTextScaleX = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1.setTextScaleX;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1;
    }
}