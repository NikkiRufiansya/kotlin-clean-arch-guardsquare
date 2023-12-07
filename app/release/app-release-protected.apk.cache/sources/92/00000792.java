package o;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import o.setBaselineAlignBottom;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339o {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    boolean ViewPager$SavedState$1;
    private LinearLayout setAnimationFromJson;
    CharSequence setCenterIfNoTextEnabled;
    int setChipCornerRadius;
    TextView setIconSize;
    int setIconTintList;
    CharSequence setLayoutAnimation;
    final C0447s setMaxEms;
    int setNavigationOnClickListener;
    ColorStateList setOnLongClickListener;
    private FrameLayout setOnNavigationItemSelectedListener;
    ColorStateList setTextAlignment;
    private int setTextAppearanceResource;
    Typeface setTextScaleX;
    TextView setUiOptions;
    CharSequence setUnboundedRipple;
    Animator setX;
    final Context setY;
    private final float setZ;

    public C0339o(C0447s c0447s) {
        Context context = c0447s.getContext();
        this.setY = context;
        this.setMaxEms = c0447s;
        this.setZ = context.getResources().getDimensionPixelSize(R.dimen.res_0x7f07008d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setUnboundedRipple = null;
        Animator animator = this.setX;
        if (animator != null) {
            animator.cancel();
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
            if (this.ViewPager$SavedState$1 && !TextUtils.isEmpty(this.setCenterIfNoTextEnabled)) {
                this.setIconTintList = 2;
            } else {
                this.setIconTintList = 0;
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, setX(this.setUiOptions, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setX(TextView textView, CharSequence charSequence) {
        return setBaselineAlignBottom.setConstraintSet(this.setMaxEms) && this.setMaxEms.isEnabled() && !(this.setIconTintList == this.MenuHostHelper$$ExternalSyntheticLambda1 && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(final int r18, final int r19, boolean r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            if (r8 != r9) goto Lb
            return
        Lb:
            r11 = 0
            r12 = 2
            r13 = 0
            r14 = 1
            if (r10 == 0) goto L68
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            r7.setX = r15
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r2 = r7.ViewPager$SavedState$1
            android.widget.TextView r3 = r7.setIconSize
            r4 = 2
            r0 = r17
            r1 = r6
            r5 = r18
            r16 = r6
            r6 = r19
            r0.setX(r1, r2, r3, r4, r5, r6)
            boolean r2 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            android.widget.TextView r3 = r7.setUiOptions
            r4 = 1
            r1 = r16
            r0.setX(r1, r2, r3, r4, r5, r6)
            r0 = r16
            o.setImeActionLabel.setX(r15, r0)
            if (r8 == r14) goto L46
            if (r8 == r12) goto L43
            r3 = r13
            goto L49
        L43:
            android.widget.TextView r0 = r7.setIconSize
            goto L48
        L46:
            android.widget.TextView r0 = r7.setUiOptions
        L48:
            r3 = r0
        L49:
            if (r9 == r14) goto L52
            if (r9 == r12) goto L4f
            r5 = r13
            goto L55
        L4f:
            android.widget.TextView r0 = r7.setIconSize
            goto L54
        L52:
            android.widget.TextView r0 = r7.setUiOptions
        L54:
            r5 = r0
        L55:
            o.o$3 r6 = new o.o$3
            r0 = r6
            r1 = r17
            r2 = r19
            r4 = r18
            r0.<init>()
            r15.addListener(r6)
            r15.start()
            goto L9b
        L68:
            if (r8 == r9) goto L9b
            if (r9 == 0) goto L81
            if (r9 == r14) goto L75
            if (r9 == r12) goto L72
            r0 = r13
            goto L77
        L72:
            android.widget.TextView r0 = r7.setIconSize
            goto L77
        L75:
            android.widget.TextView r0 = r7.setUiOptions
        L77:
            if (r0 == 0) goto L81
            r0.setVisibility(r11)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L81:
            if (r8 == 0) goto L99
            if (r8 == r14) goto L8c
            if (r8 == r12) goto L89
            r0 = r13
            goto L8e
        L89:
            android.widget.TextView r0 = r7.setIconSize
            goto L8e
        L8c:
            android.widget.TextView r0 = r7.setUiOptions
        L8e:
            if (r0 == 0) goto L99
            r1 = 4
            r0.setVisibility(r1)
            if (r8 != r14) goto L99
            r0.setText(r13)
        L99:
            r7.MenuHostHelper$$ExternalSyntheticLambda1 = r9
        L9b:
            o.s r0 = r7.setMaxEms
            r0.MenuHostHelper$$ExternalSyntheticLambda1()
            o.s r0 = r7.setMaxEms
            r0.MenuHostHelper$$ExternalSyntheticLambda0(r10, r11)
            o.s r0 = r7.setMaxEms
            r0.setLayoutAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0339o.MenuHostHelper$$ExternalSyntheticLambda0(int, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(TextView textView, int i) {
        if (this.setAnimationFromJson == null && this.setOnNavigationItemSelectedListener == null) {
            LinearLayout linearLayout = new LinearLayout(this.setY);
            this.setAnimationFromJson = linearLayout;
            linearLayout.setOrientation(0);
            this.setMaxEms.addView(this.setAnimationFromJson, -1, -2);
            this.setOnNavigationItemSelectedListener = new FrameLayout(this.setY);
            this.setAnimationFromJson.addView(this.setOnNavigationItemSelectedListener, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.setMaxEms.setUnboundedRipple != null) {
                setIconTintList();
            }
        }
        if (i == 0 || i == 1) {
            this.setOnNavigationItemSelectedListener.setVisibility(0);
            this.setOnNavigationItemSelectedListener.addView(textView);
        } else {
            this.setAnimationFromJson.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.setAnimationFromJson.setVisibility(0);
        this.setTextAppearanceResource++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.setAnimationFromJson == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.setOnNavigationItemSelectedListener) != null) {
            frameLayout.removeView(textView);
        } else {
            this.setAnimationFromJson.removeView(textView);
        }
        int i2 = this.setTextAppearanceResource - 1;
        this.setTextAppearanceResource = i2;
        LinearLayout linearLayout = this.setAnimationFromJson;
        if (i2 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return (this.setIconTintList != 1 || this.setUiOptions == null || TextUtils.isEmpty(this.setUnboundedRipple)) ? false : true;
    }

    private void setX(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i3 == i ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(setCardElevation.setY);
            list.add(ofFloat);
            if (i3 == i) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.setZ, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(setCardElevation.MenuHostHelper$$ExternalSyntheticLambda1);
                list.add(ofFloat2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        if ((this.setAnimationFromJson == null || this.setMaxEms.setUnboundedRipple == null) ? false : true) {
            EditText editText = this.setMaxEms.setUnboundedRipple;
            boolean z = this.setY.getResources().getConfiguration().fontScale >= 1.3f;
            LinearLayout linearLayout = this.setAnimationFromJson;
            int animationFromJson = setBaselineAlignBottom.setAnimationFromJson(editText);
            if (z) {
                animationFromJson = this.setY.getResources().getDimensionPixelSize(R.dimen.res_0x7f070187);
            }
            int dimensionPixelSize = this.setY.getResources().getDimensionPixelSize(R.dimen.res_0x7f070186);
            if (z) {
                dimensionPixelSize = this.setY.getResources().getDimensionPixelSize(R.dimen.res_0x7f070188);
            }
            int onNavigationItemSelectedListener = setBaselineAlignBottom.setOnNavigationItemSelectedListener(editText);
            if (z) {
                onNavigationItemSelectedListener = this.setY.getResources().getDimensionPixelSize(R.dimen.res_0x7f070187);
            }
            setBaselineAlignBottom.setX.setX(linearLayout, animationFromJson, dimensionPixelSize, onNavigationItemSelectedListener, 0);
        }
    }
}