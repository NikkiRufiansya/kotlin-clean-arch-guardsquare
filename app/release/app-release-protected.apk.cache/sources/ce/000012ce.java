package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
class wrap {
    private boolean setIconTintList;
    private final CheckedTextView setLayoutAnimation;
    private ColorStateList setX = null;
    private PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda1 = null;
    private boolean setY = false;
    private boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wrap(CheckedTextView checkedTextView) {
        this.setLayoutAnimation = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0072, B:21:0x007a), top: B:28:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0072, B:21:0x007a), top: B:28:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setX(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.setLayoutAnimation
            android.content.Context r0 = r0.getContext()
            int[] r1 = o.setAnimationFromJson.setY.setScrollY
            r2 = 0
            o.setExpandedHintEnabled r0 = o.setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(r0, r11, r1, r12, r2)
            android.widget.CheckedTextView r3 = r10.setLayoutAnimation
            android.content.Context r4 = r3.getContext()
            int[] r5 = o.setAnimationFromJson.setY.setScrollY
            android.content.res.TypedArray r7 = r0.MenuHostHelper$$ExternalSyntheticLambda0()
            r9 = 0
            r6 = r11
            r8 = r12
            o.setBaselineAlignBottom.setY(r3, r4, r5, r6, r7, r8, r9)
            int r11 = o.setAnimationFromJson.setY.setAccessibilityTraversalAfter     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L3e
            int r11 = o.setAnimationFromJson.setY.setAccessibilityTraversalAfter     // Catch: java.lang.Throwable -> L90
            int r11 = r0.setNavigationOnClickListener(r11, r2)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L3e
            android.widget.CheckedTextView r12 = r10.setLayoutAnimation     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            android.graphics.drawable.Drawable r11 = o.setFilterTouchesWhenObscured.setIconTintList(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            r12.setCheckMarkDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            r11 = 1
            goto L3f
        L3e:
            r11 = 0
        L3f:
            if (r11 != 0) goto L5e
            int r11 = o.setAnimationFromJson.setY.setSingleLine     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L5e
            int r11 = o.setAnimationFromJson.setY.setSingleLine     // Catch: java.lang.Throwable -> L90
            int r11 = r0.setNavigationOnClickListener(r11, r2)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L5e
            android.widget.CheckedTextView r12 = r10.setLayoutAnimation     // Catch: java.lang.Throwable -> L90
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L90
            android.graphics.drawable.Drawable r11 = o.setFilterTouchesWhenObscured.setIconTintList(r1, r11)     // Catch: java.lang.Throwable -> L90
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L90
        L5e:
            int r11 = o.setAnimationFromJson.setY.setSystemUiVisibility     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L72
            android.widget.CheckedTextView r11 = r10.setLayoutAnimation     // Catch: java.lang.Throwable -> L90
            int r12 = o.setAnimationFromJson.setY.setSystemUiVisibility     // Catch: java.lang.Throwable -> L90
            r12 = 2
            android.content.res.ColorStateList r12 = r0.setY(r12)     // Catch: java.lang.Throwable -> L90
            o.setProgress.MenuHostHelper$$ExternalSyntheticLambda0(r11, r12)     // Catch: java.lang.Throwable -> L90
        L72:
            int r11 = o.setAnimationFromJson.setY.setSecondaryProgressTintMode     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L8c
            android.widget.CheckedTextView r11 = r10.setLayoutAnimation     // Catch: java.lang.Throwable -> L90
            int r12 = o.setAnimationFromJson.setY.setSecondaryProgressTintMode     // Catch: java.lang.Throwable -> L90
            r12 = 3
            r1 = -1
            int r12 = r0.MenuHostHelper$$ExternalSyntheticLambda0(r12, r1)     // Catch: java.lang.Throwable -> L90
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = o.setCheckMarkDrawable.MenuHostHelper$$ExternalSyntheticLambda1(r12, r1)     // Catch: java.lang.Throwable -> L90
            o.setProgress.setY(r11, r12)     // Catch: java.lang.Throwable -> L90
        L8c:
            r0.setX()
            return
        L90:
            r11 = move-exception
            r0.setX()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wrap.setX(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(ColorStateList colorStateList) {
        this.setX = colorStateList;
        this.setY = true;
        setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(PorterDuff.Mode mode) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = mode;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setIconTintList) {
            this.setIconTintList = false;
            return;
        }
        this.setIconTintList = true;
        setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList() {
        Drawable checkMarkDrawable;
        checkMarkDrawable = this.setLayoutAnimation.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.setY || this.MenuHostHelper$$ExternalSyntheticLambda0) {
                Drawable mutate = setEnsureMinTouchTargetSize.setNavigationOnClickListener(checkMarkDrawable).mutate();
                if (this.setY) {
                    setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(mutate, this.setX);
                }
                if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    setEnsureMinTouchTargetSize.setX(mutate, this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.setLayoutAnimation.getDrawableState());
                }
                this.setLayoutAnimation.setCheckMarkDrawable(mutate);
            }
        }
    }
}