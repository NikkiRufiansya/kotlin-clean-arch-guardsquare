package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
class setScrollX {
    private final CompoundButton setOnLongClickListener;
    private boolean setY;
    private ColorStateList MenuHostHelper$$ExternalSyntheticLambda0 = null;
    private PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda1 = null;
    private boolean setIconTintList = false;
    private boolean setX = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setX(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setScrollX(CompoundButton compoundButton) {
        this.setOnLongClickListener = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0072, B:21:0x007a), top: B:28:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0072, B:21:0x007a), top: B:28:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setY(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.setOnLongClickListener
            android.content.Context r0 = r0.getContext()
            int[] r1 = o.setAnimationFromJson.setY.setUserInputEnabled
            r2 = 0
            o.setExpandedHintEnabled r0 = o.setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.setOnLongClickListener
            android.content.Context r4 = r3.getContext()
            int[] r5 = o.setAnimationFromJson.setY.setUserInputEnabled
            android.content.res.TypedArray r7 = r0.MenuHostHelper$$ExternalSyntheticLambda0()
            r9 = 0
            r6 = r11
            r8 = r12
            o.setBaselineAlignBottom.setY(r3, r4, r5, r6, r7, r8, r9)
            int r11 = o.setAnimationFromJson.setY.setOutlineAmbientShadowColor     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L3e
            int r11 = o.setAnimationFromJson.setY.setOutlineAmbientShadowColor     // Catch: java.lang.Throwable -> L90
            int r11 = r0.setNavigationOnClickListener(r11, r2)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L3e
            android.widget.CompoundButton r12 = r10.setOnLongClickListener     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            android.graphics.drawable.Drawable r11 = o.setFilterTouchesWhenObscured.setIconTintList(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L90
            r11 = 1
            goto L3f
        L3e:
            r11 = 0
        L3f:
            if (r11 != 0) goto L5e
            int r11 = o.setAnimationFromJson.setY.setIndeterminateTintList     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L5e
            int r11 = o.setAnimationFromJson.setY.setIndeterminateTintList     // Catch: java.lang.Throwable -> L90
            int r11 = r0.setNavigationOnClickListener(r11, r2)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L5e
            android.widget.CompoundButton r12 = r10.setOnLongClickListener     // Catch: java.lang.Throwable -> L90
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L90
            android.graphics.drawable.Drawable r11 = o.setFilterTouchesWhenObscured.setIconTintList(r1, r11)     // Catch: java.lang.Throwable -> L90
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L90
        L5e:
            int r11 = o.setAnimationFromJson.setY.setForceShowIcon     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L72
            android.widget.CompoundButton r11 = r10.setOnLongClickListener     // Catch: java.lang.Throwable -> L90
            int r12 = o.setAnimationFromJson.setY.setForceShowIcon     // Catch: java.lang.Throwable -> L90
            r12 = 2
            android.content.res.ColorStateList r12 = r0.setY(r12)     // Catch: java.lang.Throwable -> L90
            o.getCallingUserHandle.MenuHostHelper$$ExternalSyntheticLambda1(r11, r12)     // Catch: java.lang.Throwable -> L90
        L72:
            int r11 = o.setAnimationFromJson.setY.setSearchResultHighlightColor     // Catch: java.lang.Throwable -> L90
            boolean r11 = r0.setLayoutAnimation(r11)     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L8c
            android.widget.CompoundButton r11 = r10.setOnLongClickListener     // Catch: java.lang.Throwable -> L90
            int r12 = o.setAnimationFromJson.setY.setSearchResultHighlightColor     // Catch: java.lang.Throwable -> L90
            r12 = 3
            r1 = -1
            int r12 = r0.MenuHostHelper$$ExternalSyntheticLambda0(r12, r1)     // Catch: java.lang.Throwable -> L90
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = o.setCheckMarkDrawable.MenuHostHelper$$ExternalSyntheticLambda1(r12, r1)     // Catch: java.lang.Throwable -> L90
            o.getCallingUserHandle.MenuHostHelper$$ExternalSyntheticLambda0(r11, r12)     // Catch: java.lang.Throwable -> L90
        L8c:
            r0.setX()
            return
        L90:
            r11 = move-exception
            r0.setX()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setScrollX.setY(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = colorStateList;
        this.setIconTintList = true;
        setY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(PorterDuff.Mode mode) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = mode;
        this.setX = true;
        setY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList() {
        if (this.setY) {
            this.setY = false;
            return;
        }
        this.setY = true;
        setY();
    }

    void setY() {
        Drawable MenuHostHelper$$ExternalSyntheticLambda1 = getCallingUserHandle.MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            if (this.setIconTintList || this.setX) {
                Drawable mutate = setEnsureMinTouchTargetSize.setNavigationOnClickListener(MenuHostHelper$$ExternalSyntheticLambda1).mutate();
                if (this.setIconTintList) {
                    setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(mutate, this.MenuHostHelper$$ExternalSyntheticLambda0);
                }
                if (this.setX) {
                    setEnsureMinTouchTargetSize.setX(mutate, this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.setOnLongClickListener.getDrawableState());
                }
                this.setOnLongClickListener.setButtonDrawable(mutate);
            }
        }
    }
}