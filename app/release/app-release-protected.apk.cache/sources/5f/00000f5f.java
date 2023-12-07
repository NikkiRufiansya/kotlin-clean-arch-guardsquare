package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o.setAnimationFromJson;
import o.setTextStartPaddingResource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSelectedTabIndicator {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private setStripEnabled MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1 = 0;
    private int setCenterIfNoTextEnabled = -1;
    private final TextView setChipCornerRadius;
    private setStripEnabled setIconTintList;
    private setStripEnabled setLayoutAnimation;
    private setStripEnabled setNavigationOnClickListener;
    private setStripEnabled setOnLongClickListener;
    private setStripEnabled setUiOptions;
    private Typeface setUnboundedRipple;
    private final setAllowedHandwritingDelegatorPackage setX;
    private setStripEnabled setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSelectedTabIndicator(TextView textView) {
        this.setChipCornerRadius = textView;
        this.setX = new setAllowedHandwritingDelegatorPackage(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setY(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSelectedTabIndicator.setY(android.util.AttributeSet, int):void");
    }

    private void setX(Context context, setExpandedHintEnabled setexpandedhintenabled) {
        int i;
        String navigationOnClickListener;
        this.ViewPager$SavedState$1 = setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setRating, this.ViewPager$SavedState$1);
        if (Build.VERSION.SDK_INT >= 28) {
            int MenuHostHelper$$ExternalSyntheticLambda0 = setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setOnCheckedChangeListener, -1);
            this.setCenterIfNoTextEnabled = MenuHostHelper$$ExternalSyntheticLambda0;
            if (MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
                this.ViewPager$SavedState$1 &= 2;
            }
        }
        if (!setexpandedhintenabled.setLayoutAnimation(setAnimationFromJson.setY.clone)) {
            int i2 = setAnimationFromJson.setY.NavigationBarView$SavedState$1;
            if (!setexpandedhintenabled.setLayoutAnimation(12)) {
                if (setexpandedhintenabled.setLayoutAnimation(setAnimationFromJson.setY.setChipStrokeColor)) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
                    int MenuHostHelper$$ExternalSyntheticLambda02 = setexpandedhintenabled.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setChipStrokeColor, 1);
                    if (MenuHostHelper$$ExternalSyntheticLambda02 == 1) {
                        this.setUnboundedRipple = Typeface.SANS_SERIF;
                        return;
                    } else if (MenuHostHelper$$ExternalSyntheticLambda02 == 2) {
                        this.setUnboundedRipple = Typeface.SERIF;
                        return;
                    } else if (MenuHostHelper$$ExternalSyntheticLambda02 == 3) {
                        this.setUnboundedRipple = Typeface.MONOSPACE;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
        }
        this.setUnboundedRipple = null;
        if (setexpandedhintenabled.setLayoutAnimation(setAnimationFromJson.setY.NavigationBarView$SavedState$1)) {
            i = setAnimationFromJson.setY.NavigationBarView$SavedState$1;
        } else {
            i = setAnimationFromJson.setY.clone;
        }
        final int i3 = this.setCenterIfNoTextEnabled;
        final int i4 = this.ViewPager$SavedState$1;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.setChipCornerRadius);
            try {
                Typeface x = setexpandedhintenabled.setX(i, this.ViewPager$SavedState$1, new setTextStartPaddingResource.setY() { // from class: o.setSelectedTabIndicator.1
                    @Override // o.setTextStartPaddingResource.setY
                    public void setIconTintList(int i5) {
                    }

                    @Override // o.setTextStartPaddingResource.setY
                    public void setIconTintList(Typeface typeface) {
                        int i5;
                        if (Build.VERSION.SDK_INT >= 28 && (i5 = i3) != -1) {
                            typeface = setX.setY(typeface, i5, (i4 & 2) != 0);
                        }
                        setSelectedTabIndicator.this.setY(weakReference, typeface);
                    }
                });
                if (x != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.setCenterIfNoTextEnabled != -1) {
                        this.setUnboundedRipple = setX.setY(Typeface.create(x, 0), this.setCenterIfNoTextEnabled, (this.ViewPager$SavedState$1 & 2) != 0);
                    } else {
                        this.setUnboundedRipple = x;
                    }
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setUnboundedRipple == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.setUnboundedRipple != null || (navigationOnClickListener = setexpandedhintenabled.setNavigationOnClickListener(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.setCenterIfNoTextEnabled != -1) {
            this.setUnboundedRipple = setX.setY(Typeface.create(navigationOnClickListener, 0), this.setCenterIfNoTextEnabled, (this.ViewPager$SavedState$1 & 2) != 0);
        } else {
            this.setUnboundedRipple = Typeface.create(navigationOnClickListener, this.ViewPager$SavedState$1);
        }
    }

    void setY(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setUnboundedRipple = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (setBaselineAlignBottom.setChipIconTintResource(textView)) {
                    final int i = this.ViewPager$SavedState$1;
                    textView.post(new Runnable() { // from class: o.setSelectedTabIndicator.4
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                    return;
                }
                textView.setTypeface(typeface, this.ViewPager$SavedState$1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(Context context, int i) {
        String navigationOnClickListener;
        setExpandedHintEnabled y = setExpandedHintEnabled.setY(context, i, setAnimationFromJson.setY.setBoxStrokeWidthResource);
        if (y.setLayoutAnimation(setAnimationFromJson.setY.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable)) {
            setY(y.setIconTintList(setAnimationFromJson.setY.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (y.setLayoutAnimation(setAnimationFromJson.setY.SearchView)) {
                int i2 = setAnimationFromJson.setY.SearchView;
                ColorStateList y2 = y.setY(3);
                if (y2 != null) {
                    this.setChipCornerRadius.setTextColor(y2);
                }
            }
            if (y.setLayoutAnimation(setAnimationFromJson.setY.setFlexWrap)) {
                int i3 = setAnimationFromJson.setY.setFlexWrap;
                ColorStateList y3 = y.setY(5);
                if (y3 != null) {
                    this.setChipCornerRadius.setLinkTextColor(y3);
                }
            }
            if (y.setLayoutAnimation(setAnimationFromJson.setY.setChipStrokeWidthResource)) {
                int i4 = setAnimationFromJson.setY.setChipStrokeWidthResource;
                ColorStateList y4 = y.setY(4);
                if (y4 != null) {
                    this.setChipCornerRadius.setHintTextColor(y4);
                }
            }
        }
        if (y.setLayoutAnimation(setAnimationFromJson.setY.setItemRippleColor) && y.setY(setAnimationFromJson.setY.setItemRippleColor, -1) == 0) {
            this.setChipCornerRadius.setTextSize(0, 0.0f);
        }
        setX(context, y);
        if (Build.VERSION.SDK_INT >= 26) {
            int i5 = setAnimationFromJson.setY.ActivityResult$1;
            if (y.setLayoutAnimation(13) && (navigationOnClickListener = y.setNavigationOnClickListener(setAnimationFromJson.setY.ActivityResult$1)) != null) {
                setSelectedTabIndicator$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, navigationOnClickListener);
            }
        }
        y.setX();
        Typeface typeface = this.setUnboundedRipple;
        if (typeface != null) {
            this.setChipCornerRadius.setTypeface(typeface, this.ViewPager$SavedState$1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(boolean z) {
        this.setChipCornerRadius.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnLongClickListener() {
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null || this.setUiOptions != null || this.setOnLongClickListener != null || this.setIconTintList != null) {
            Drawable[] compoundDrawables = this.setChipCornerRadius.getCompoundDrawables();
            setY(compoundDrawables[0], this.MenuHostHelper$$ExternalSyntheticLambda1);
            setY(compoundDrawables[1], this.setUiOptions);
            setY(compoundDrawables[2], this.setOnLongClickListener);
            setY(compoundDrawables[3], this.setIconTintList);
        }
        if (this.setLayoutAnimation == null && this.setY == null) {
            return;
        }
        Drawable[] y = setY.setY(this.setChipCornerRadius);
        setY(y[0], this.setLayoutAnimation);
        setY(y[2], this.setY);
    }

    private void setY(Drawable drawable, setStripEnabled setstripenabled) {
        if (drawable == null || setstripenabled == null) {
            return;
        }
        setSelectionFromTop.setY(drawable, setstripenabled, this.setChipCornerRadius.getDrawableState());
    }

    private static setStripEnabled MenuHostHelper$$ExternalSyntheticLambda0(Context context, setSelectionFromTop setselectionfromtop, int i) {
        ColorStateList iconTintList = setselectionfromtop.setIconTintList(context, i);
        if (iconTintList != null) {
            setStripEnabled setstripenabled = new setStripEnabled();
            setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            setstripenabled.setIconTintList = iconTintList;
            return setstripenabled;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z, int i, int i2, int i3, int i4) {
        if (ProcessLifecycleInitializer.setIconTintList) {
            return;
        }
        setY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(int i, float f) {
        if (ProcessLifecycleInitializer.setIconTintList || setUnboundedRipple()) {
            return;
        }
        setIconTintList(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY() {
        this.setX.setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setUnboundedRipple() {
        return this.setX.setNavigationOnClickListener();
    }

    private void setIconTintList(int i, float f) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setX.setX(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(int i, int i2, int i3, int i4) {
        this.setX.setY(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(int[] iArr, int i) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setLayoutAnimation() {
        return this.setX.setLayoutAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setIconTintList() {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setX() {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX.setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] setUiOptions() {
        return this.setX.setY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(ColorStateList colorStateList) {
        if (this.setNavigationOnClickListener == null) {
            this.setNavigationOnClickListener = new setStripEnabled();
        }
        this.setNavigationOnClickListener.setIconTintList = colorStateList;
        this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = colorStateList != null;
        setNavigationOnClickListener();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(PorterDuff.Mode mode) {
        if (this.setNavigationOnClickListener == null) {
            this.setNavigationOnClickListener = new setStripEnabled();
        }
        this.setNavigationOnClickListener.setX = mode;
        this.setNavigationOnClickListener.setY = mode != null;
        setNavigationOnClickListener();
    }

    private void setNavigationOnClickListener() {
        setStripEnabled setstripenabled = this.setNavigationOnClickListener;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setstripenabled;
        this.setUiOptions = setstripenabled;
        this.setOnLongClickListener = setstripenabled;
        this.setIconTintList = setstripenabled;
        this.setLayoutAnimation = setstripenabled;
        this.setY = setstripenabled;
    }

    private void setX(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] y = setY.setY(this.setChipCornerRadius);
            TextView textView = this.setChipCornerRadius;
            if (drawable5 == null) {
                drawable5 = y[0];
            }
            if (drawable2 == null) {
                drawable2 = y[1];
            }
            if (drawable6 == null) {
                drawable6 = y[2];
            }
            if (drawable4 == null) {
                drawable4 = y[3];
            }
            setY.setY(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] y2 = setY.setY(this.setChipCornerRadius);
            Drawable drawable7 = y2[0];
            if (drawable7 != null || y2[2] != null) {
                TextView textView2 = this.setChipCornerRadius;
                if (drawable2 == null) {
                    drawable2 = y2[1];
                }
                Drawable drawable8 = y2[2];
                if (drawable4 == null) {
                    drawable4 = y2[3];
                }
                setY.setY(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            Drawable[] compoundDrawables = this.setChipCornerRadius.getCompoundDrawables();
            TextView textView3 = this.setChipCornerRadius;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        setOverflowReserved.MenuHostHelper$$ExternalSyntheticLambda0(editorInfo, textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        static LocaleList setIconTintList(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        static void setX(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }

        static void setY(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static Drawable[] setY(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        static Typeface setY(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }
}