package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import o.setEnsureMinTouchTargetSize;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSuffixText extends Drawable implements Drawable.Callback {
    private Drawable MenuHostHelper$$ExternalSyntheticLambda1;
    private Drawable ViewPager$SavedState$1;
    private boolean setChipCornerRadius;
    private setSuffixText$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
    private Rect setLayoutAnimation;
    private boolean setNavigationOnClickListener;
    private long setOnLongClickListener;
    private setIconTintList setUiOptions;
    private long setUnboundedRipple;
    private Runnable setY;
    private int MenuHostHelper$$ExternalSyntheticLambda0 = 255;
    private int setX = -1;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.ViewPager$SavedState$1;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.setUiOptions.getChangingConfigurations();
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return isAutoMirrored() && setEnsureMinTouchTargetSize.setIconTintList(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect layoutAnimation = this.setUiOptions.setLayoutAnimation();
        if (layoutAnimation != null) {
            rect.set(layoutAnimation);
            padding = (layoutAnimation.right | ((layoutAnimation.left | layoutAnimation.top) | layoutAnimation.bottom)) != 0;
        } else {
            Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.setNavigationOnClickListener && this.MenuHostHelper$$ExternalSyntheticLambda0 == i) {
            return;
        }
        this.setNavigationOnClickListener = true;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            if (this.setOnLongClickListener == 0) {
                drawable.setAlpha(i);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda1(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.setUiOptions.setTextScaleX != z) {
            this.setUiOptions.setTextScaleX = z;
            Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (drawable != null) {
                drawable.setDither(this.setUiOptions.setTextScaleX);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.setUiOptions.setLayoutDirection = true;
        if (this.setUiOptions.setIconSize != colorFilter) {
            this.setUiOptions.setIconSize = colorFilter;
            Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.setUiOptions.ExtendableSavedState$1 = true;
        if (this.setUiOptions.FragmentStateAdapter$5 != colorStateList) {
            this.setUiOptions.FragmentStateAdapter$5 = colorStateList;
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.setUiOptions.setHasDecor = true;
        if (this.setUiOptions.setAdapter != mode) {
            this.setUiOptions.setAdapter = mode;
            setEnsureMinTouchTargetSize.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.ViewPager$SavedState$1;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.setUiOptions.setIconSize();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1 != z) {
            this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1 = z;
            Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (drawable != null) {
                drawable.setAutoMirrored(this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.ViewPager$SavedState$1;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.ViewPager$SavedState$1 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.setNavigationOnClickListener) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setAlpha(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        if (this.setUnboundedRipple != 0) {
            this.setUnboundedRipple = 0L;
            z = true;
        }
        if (this.setOnLongClickListener != 0) {
            this.setOnLongClickListener = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            setEnsureMinTouchTargetSize.setX(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.setLayoutAnimation;
        if (rect == null) {
            this.setLayoutAnimation = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.setLayoutAnimation;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.ViewPager$SavedState$1;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.ViewPager$SavedState$1;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(i, setIconTintList());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.setUiOptions.ViewPager$SavedState$1()) {
            return this.setUiOptions.setUiOptions();
        }
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.setUiOptions.ViewPager$SavedState$1()) {
            return this.setUiOptions.setOnLongClickListener();
        }
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.setUiOptions.ViewPager$SavedState$1()) {
            return this.setUiOptions.setUnboundedRipple();
        }
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.setUiOptions.ViewPager$SavedState$1()) {
            return this.setUiOptions.setNavigationOnClickListener();
        }
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        setIconTintList seticontintlist = this.setUiOptions;
        if (seticontintlist != null) {
            seticontintlist.setTextAlignment();
        }
        if (drawable != this.MenuHostHelper$$ExternalSyntheticLambda1 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.MenuHostHelper$$ExternalSyntheticLambda1 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.MenuHostHelper$$ExternalSyntheticLambda1 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.ViewPager$SavedState$1;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.setUiOptions.setCenterIfNoTextEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setIconTintList() {
        return this.setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setIconTintList(int i) {
        if (i == this.setX) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.setUiOptions.setGuidelinePercent > 0) {
            Drawable drawable = this.ViewPager$SavedState$1;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (drawable2 != null) {
                this.ViewPager$SavedState$1 = drawable2;
                this.setUnboundedRipple = this.setUiOptions.setGuidelinePercent + uptimeMillis;
            } else {
                this.ViewPager$SavedState$1 = null;
                this.setUnboundedRipple = 0L;
            }
        } else {
            Drawable drawable3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0 && i < this.setUiOptions.setChipIconTintResource) {
            Drawable iconTintList = this.setUiOptions.setIconTintList(i);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList;
            this.setX = i;
            if (iconTintList != null) {
                if (this.setUiOptions.setCheckedIconEnabled > 0) {
                    this.setOnLongClickListener = uptimeMillis + this.setUiOptions.setCheckedIconEnabled;
                }
                MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
            }
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            this.setX = -1;
        }
        if (this.setOnLongClickListener != 0 || this.setUnboundedRipple != 0) {
            Runnable runnable = this.setY;
            if (runnable == null) {
                this.setY = new Runnable() { // from class: o.setSuffixText.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        setSuffixText.this.MenuHostHelper$$ExternalSyntheticLambda1(true);
                        setSuffixText.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            MenuHostHelper$$ExternalSyntheticLambda1(true);
        }
        invalidateSelf();
        return true;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        if (this.setIconTintList == null) {
            this.setIconTintList = new setSuffixText$MenuHostHelper$$ExternalSyntheticLambda1();
        }
        setSuffixText$MenuHostHelper$$ExternalSyntheticLambda1 setsuffixtext_menuhosthelper__externalsyntheticlambda1 = this.setIconTintList;
        setsuffixtext_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = drawable.getCallback();
        drawable.setCallback(setsuffixtext_menuhosthelper__externalsyntheticlambda1);
        try {
            if (this.setUiOptions.setCheckedIconEnabled <= 0 && this.setNavigationOnClickListener) {
                drawable.setAlpha(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            if (this.setUiOptions.setLayoutDirection) {
                drawable.setColorFilter(this.setUiOptions.setIconSize);
            } else {
                if (this.setUiOptions.ExtendableSavedState$1) {
                    setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, this.setUiOptions.FragmentStateAdapter$5);
                }
                if (this.setUiOptions.setHasDecor) {
                    setEnsureMinTouchTargetSize.setX(drawable, this.setUiOptions.setAdapter);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.setUiOptions.setTextScaleX);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable, setEnsureMinTouchTargetSize.setIconTintList(this));
            }
            drawable.setAutoMirrored(this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1);
            Rect rect = this.setLayoutAnimation;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            setSuffixText$MenuHostHelper$$ExternalSyntheticLambda1 setsuffixtext_menuhosthelper__externalsyntheticlambda12 = this.setIconTintList;
            Drawable.Callback callback = setsuffixtext_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1;
            setsuffixtext_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void MenuHostHelper$$ExternalSyntheticLambda1(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.setNavigationOnClickListener = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.MenuHostHelper$$ExternalSyntheticLambda1
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.setOnLongClickListener
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.MenuHostHelper$$ExternalSyntheticLambda0
            r3.setAlpha(r9)
            goto L38
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            o.setSuffixText$setIconTintList r9 = r13.setUiOptions
            int r9 = r9.setCheckedIconEnabled
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r13.MenuHostHelper$$ExternalSyntheticLambda1
            int r3 = 255 - r3
            int r10 = r13.MenuHostHelper$$ExternalSyntheticLambda0
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L3b
        L38:
            r13.setOnLongClickListener = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.ViewPager$SavedState$1
            if (r9 == 0) goto L65
            long r10 = r13.setUnboundedRipple
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r6, r6)
            r0 = 0
            r13.ViewPager$SavedState$1 = r0
            goto L65
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            o.setSuffixText$setIconTintList r4 = r13.setUiOptions
            int r4 = r4.setGuidelinePercent
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r13.ViewPager$SavedState$1
            int r5 = r13.MenuHostHelper$$ExternalSyntheticLambda0
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L68
        L65:
            r13.setUnboundedRipple = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.setY
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSuffixText.MenuHostHelper$$ExternalSyntheticLambda1(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Resources resources) {
        this.setUiOptions.setY(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.setUiOptions.setX(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.setUiOptions.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0()) {
            this.setUiOptions.setY = getChangingConfigurations();
            return this.setUiOptions;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.setChipCornerRadius && super.mutate() == this) {
            setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
            MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
            this.setChipCornerRadius = true;
        }
        return this;
    }

    setIconTintList MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUiOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class setIconTintList extends Drawable.ConstantState {
        boolean ExtendableSavedState$1;
        Resources FloatingActionButton$BaseBehavior;
        int FragmentStateAdapter$2;
        ColorStateList FragmentStateAdapter$5;
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        boolean SearchView$SavedState$1;
        int ViewPager$SavedState$1;
        PorterDuff.Mode setAdapter;
        int setAnimationFromJson;
        int setCenterIfNoTextEnabled;
        int setCheckedIconEnabled;
        int setChipCornerRadius;
        int setChipIconTintResource;
        boolean setConstraintSet;
        final setSuffixText setContentScrimResource;
        int setGuidelinePercent;
        boolean setHasDecor;
        ColorFilter setIconSize;
        int setIconified;
        boolean setLayoutAnimation;
        boolean setLayoutDirection;
        boolean setMaxEms;
        SparseArray<Drawable.ConstantState> setMinAndMaxProgress;
        boolean setNavigationOnClickListener;
        boolean setOnLongClickListener;
        int setOnNavigationItemSelectedListener;
        int setTextAlignment;
        Drawable[] setTextAppearanceResource;
        boolean setTextScaleX;
        boolean setUiOptions;
        boolean setUnboundedRipple;
        boolean setViewTranslationCallback;
        int setY;
        Rect setZ;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(setIconTintList seticontintlist, setSuffixText setsuffixtext, Resources resources) {
            Resources resources2;
            this.setViewTranslationCallback = false;
            this.setMaxEms = false;
            this.setTextScaleX = true;
            this.setCheckedIconEnabled = 0;
            this.setGuidelinePercent = 0;
            this.setContentScrimResource = setsuffixtext;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = seticontintlist != null ? seticontintlist.FloatingActionButton$BaseBehavior : null;
            }
            this.FloatingActionButton$BaseBehavior = resources2;
            int y = setSuffixText.setY(resources, seticontintlist != null ? seticontintlist.setOnNavigationItemSelectedListener : 0);
            this.setOnNavigationItemSelectedListener = y;
            if (seticontintlist != null) {
                this.setY = seticontintlist.setY;
                this.setCenterIfNoTextEnabled = seticontintlist.setCenterIfNoTextEnabled;
                this.setLayoutAnimation = true;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                this.setViewTranslationCallback = seticontintlist.setViewTranslationCallback;
                this.setMaxEms = seticontintlist.setMaxEms;
                this.setTextScaleX = seticontintlist.setTextScaleX;
                this.SearchView$SavedState$1 = seticontintlist.SearchView$SavedState$1;
                this.setIconified = seticontintlist.setIconified;
                this.setCheckedIconEnabled = seticontintlist.setCheckedIconEnabled;
                this.setGuidelinePercent = seticontintlist.setGuidelinePercent;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                this.setIconSize = seticontintlist.setIconSize;
                this.setLayoutDirection = seticontintlist.setLayoutDirection;
                this.FragmentStateAdapter$5 = seticontintlist.FragmentStateAdapter$5;
                this.setAdapter = seticontintlist.setAdapter;
                this.ExtendableSavedState$1 = seticontintlist.ExtendableSavedState$1;
                this.setHasDecor = seticontintlist.setHasDecor;
                if (seticontintlist.setOnNavigationItemSelectedListener == y) {
                    if (seticontintlist.setNavigationOnClickListener) {
                        this.setZ = seticontintlist.setZ != null ? new Rect(seticontintlist.setZ) : null;
                        this.setNavigationOnClickListener = true;
                    }
                    if (seticontintlist.setUnboundedRipple) {
                        this.setAnimationFromJson = seticontintlist.setAnimationFromJson;
                        this.setChipCornerRadius = seticontintlist.setChipCornerRadius;
                        this.ViewPager$SavedState$1 = seticontintlist.ViewPager$SavedState$1;
                        this.setTextAlignment = seticontintlist.setTextAlignment;
                        this.setUnboundedRipple = true;
                    }
                }
                if (seticontintlist.setUiOptions) {
                    this.FragmentStateAdapter$2 = seticontintlist.FragmentStateAdapter$2;
                    this.setUiOptions = true;
                }
                if (seticontintlist.setOnLongClickListener) {
                    this.setConstraintSet = seticontintlist.setConstraintSet;
                    this.setOnLongClickListener = true;
                }
                Drawable[] drawableArr = seticontintlist.setTextAppearanceResource;
                this.setTextAppearanceResource = new Drawable[drawableArr.length];
                this.setChipIconTintResource = seticontintlist.setChipIconTintResource;
                SparseArray<Drawable.ConstantState> sparseArray = seticontintlist.setMinAndMaxProgress;
                if (sparseArray != null) {
                    this.setMinAndMaxProgress = sparseArray.clone();
                } else {
                    this.setMinAndMaxProgress = new SparseArray<>(this.setChipIconTintResource);
                }
                int i = this.setChipIconTintResource;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.setMinAndMaxProgress.put(i2, constantState);
                        } else {
                            this.setTextAppearanceResource[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.setTextAppearanceResource = new Drawable[10];
            this.setChipIconTintResource = 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.setY | this.setCenterIfNoTextEnabled;
        }

        public final int setIconTintList(Drawable drawable) {
            int i = this.setChipIconTintResource;
            if (i >= this.setTextAppearanceResource.length) {
                setX(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.setContentScrimResource);
            this.setTextAppearanceResource[i] = drawable;
            this.setChipIconTintResource++;
            this.setCenterIfNoTextEnabled = drawable.getChangingConfigurations() | this.setCenterIfNoTextEnabled;
            setTextAlignment();
            this.setZ = null;
            this.setNavigationOnClickListener = false;
            this.setUnboundedRipple = false;
            this.setLayoutAnimation = false;
            return i;
        }

        void setTextAlignment() {
            this.setUiOptions = false;
            this.setOnLongClickListener = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int setX() {
            return this.setTextAppearanceResource.length;
        }

        private void setChipCornerRadius() {
            SparseArray<Drawable.ConstantState> sparseArray = this.setMinAndMaxProgress;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.setTextAppearanceResource[this.setMinAndMaxProgress.keyAt(i)] = MenuHostHelper$$ExternalSyntheticLambda0(this.setMinAndMaxProgress.valueAt(i).newDrawable(this.FloatingActionButton$BaseBehavior));
                }
                this.setMinAndMaxProgress = null;
            }
        }

        private Drawable MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable, this.setIconified);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.setContentScrimResource);
            return mutate;
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setChipIconTintResource;
        }

        public final Drawable setIconTintList(int i) {
            int indexOfKey;
            Drawable drawable = this.setTextAppearanceResource[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.setMinAndMaxProgress;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(this.setMinAndMaxProgress.valueAt(indexOfKey).newDrawable(this.FloatingActionButton$BaseBehavior));
            this.setTextAppearanceResource[i] = MenuHostHelper$$ExternalSyntheticLambda0;
            this.setMinAndMaxProgress.removeAt(indexOfKey);
            if (this.setMinAndMaxProgress.size() == 0) {
                this.setMinAndMaxProgress = null;
            }
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }

        final boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
            int i3 = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean MenuHostHelper$$ExternalSyntheticLambda0 = Build.VERSION.SDK_INT >= 23 ? setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                }
            }
            this.setIconified = i;
            return z;
        }

        final void setY(Resources resources) {
            if (resources != null) {
                this.FloatingActionButton$BaseBehavior = resources;
                int y = setSuffixText.setY(resources, this.setOnNavigationItemSelectedListener);
                int i = this.setOnNavigationItemSelectedListener;
                this.setOnNavigationItemSelectedListener = y;
                if (i != y) {
                    this.setUnboundedRipple = false;
                    this.setNavigationOnClickListener = false;
                }
            }
        }

        final void setX(Resources.Theme theme) {
            boolean x;
            if (theme != null) {
                setChipCornerRadius();
                int i = this.setChipIconTintResource;
                Drawable[] drawableArr = this.setTextAppearanceResource;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null) {
                        x = setEnsureMinTouchTargetSize.setIconTintList.setX(drawable);
                        if (x) {
                            setEnsureMinTouchTargetSize.setY(drawableArr[i2], theme);
                            this.setCenterIfNoTextEnabled |= drawableArr[i2].getChangingConfigurations();
                        }
                    }
                }
                setY(setX.setX(theme));
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            boolean x;
            int i = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    x = setEnsureMinTouchTargetSize.setIconTintList.setX(drawable);
                    if (x) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.setMinAndMaxProgress.get(i2);
                    if (constantState != null && setX.setIconTintList(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        void setIconTintList() {
            int i = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.SearchView$SavedState$1 = true;
        }

        public final void setX(boolean z) {
            this.setViewTranslationCallback = z;
        }

        public final Rect setLayoutAnimation() {
            Rect rect = null;
            if (this.setViewTranslationCallback) {
                return null;
            }
            Rect rect2 = this.setZ;
            if (rect2 != null || this.setNavigationOnClickListener) {
                return rect2;
            }
            setChipCornerRadius();
            Rect rect3 = new Rect();
            int i = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    if (rect3.left > rect.left) {
                        rect.left = rect3.left;
                    }
                    if (rect3.top > rect.top) {
                        rect.top = rect3.top;
                    }
                    if (rect3.right > rect.right) {
                        rect.right = rect3.right;
                    }
                    if (rect3.bottom > rect.bottom) {
                        rect.bottom = rect3.bottom;
                    }
                }
            }
            this.setNavigationOnClickListener = true;
            this.setZ = rect;
            return rect;
        }

        public final void setIconTintList(boolean z) {
            this.setMaxEms = z;
        }

        public final boolean ViewPager$SavedState$1() {
            return this.setMaxEms;
        }

        public final int setUiOptions() {
            if (!this.setUnboundedRipple) {
                setY();
            }
            return this.setAnimationFromJson;
        }

        public final int setOnLongClickListener() {
            if (!this.setUnboundedRipple) {
                setY();
            }
            return this.setChipCornerRadius;
        }

        public final int setUnboundedRipple() {
            if (!this.setUnboundedRipple) {
                setY();
            }
            return this.ViewPager$SavedState$1;
        }

        public final int setNavigationOnClickListener() {
            if (!this.setUnboundedRipple) {
                setY();
            }
            return this.setTextAlignment;
        }

        protected void setY() {
            this.setUnboundedRipple = true;
            setChipCornerRadius();
            int i = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            this.setChipCornerRadius = -1;
            this.setAnimationFromJson = -1;
            this.setTextAlignment = 0;
            this.ViewPager$SavedState$1 = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.setAnimationFromJson) {
                    this.setAnimationFromJson = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.setChipCornerRadius) {
                    this.setChipCornerRadius = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.ViewPager$SavedState$1) {
                    this.ViewPager$SavedState$1 = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.setTextAlignment) {
                    this.setTextAlignment = minimumHeight;
                }
            }
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            this.setCheckedIconEnabled = i;
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            this.setGuidelinePercent = i;
        }

        public final int setCenterIfNoTextEnabled() {
            if (this.setUiOptions) {
                return this.FragmentStateAdapter$2;
            }
            setChipCornerRadius();
            int i = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.FragmentStateAdapter$2 = opacity;
            this.setUiOptions = true;
            return opacity;
        }

        public final boolean setIconSize() {
            if (this.setOnLongClickListener) {
                return this.setConstraintSet;
            }
            setChipCornerRadius();
            int i = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.setConstraintSet = z;
            this.setOnLongClickListener = true;
            return z;
        }

        public void setX(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.setTextAppearanceResource;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.setTextAppearanceResource = drawableArr;
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            if (this.setLayoutAnimation) {
                return this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            setChipCornerRadius();
            this.setLayoutAnimation = true;
            int i = this.setChipIconTintResource;
            Drawable[] drawableArr = this.setTextAppearanceResource;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
                    return false;
                }
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList seticontintlist) {
        this.setUiOptions = seticontintlist;
        int i = this.setX;
        if (i >= 0) {
            Drawable iconTintList = seticontintlist.setIconTintList(i);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList;
            if (iconTintList != null) {
                MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
            }
        }
        this.ViewPager$SavedState$1 = null;
    }

    static int setY(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        public static boolean setIconTintList(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static Resources setX(Resources.Theme theme) {
            return theme.getResources();
        }
    }
}