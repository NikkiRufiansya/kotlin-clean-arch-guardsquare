package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import o.setBaselineAlignBottom;
import o.setReferencedIds;
import o.setScrollBarDefaultDelayBeforeFade;

/* loaded from: classes.dex */
public final class setIconGravity extends Drawable implements setReferencedIds.setY {

    /* renamed from: setIconTintList */
    public static final int _res_0x7f1503ad = 2132083629;
    public static final int setX = 2130968653;
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public final WeakReference<Context> MenuHostHelper$$ExternalSyntheticLambda1;
    private float ViewPager$SavedState$1;
    private float setCenterIfNoTextEnabled;
    private final setReferencedIds setChipCornerRadius;
    private final setWebViewClient setIconSize;
    private final Rect setLayoutAnimation;
    private WeakReference<View> setNavigationOnClickListener;
    private float setOnLongClickListener;
    private float setTextAlignment;
    private float setUiOptions;
    public final setLeftTopRightBottom setUnboundedRipple;
    public WeakReference<FrameLayout> setY;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public setIconGravity(Context context, int i, int i2, setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1 setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1) {
        setHeight setheight;
        Context context2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new WeakReference<>(context);
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context, ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setIconTintList, "Theme.MaterialComponents");
        this.setLayoutAnimation = new Rect();
        this.setIconSize = new setWebViewClient();
        setReferencedIds setreferencedids = new setReferencedIds(this);
        this.setChipCornerRadius = setreferencedids;
        setreferencedids.setY.setTextAlign(Paint.Align.CENTER);
        Context context3 = this.MenuHostHelper$$ExternalSyntheticLambda1.get();
        if (context3 != null && this.setChipCornerRadius.setIconTintList != (setheight = new setHeight(context3, R.style._res_0x7f1501d4)) && (context2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get()) != null) {
            this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(setheight, context2);
            setY();
        }
        setLeftTopRightBottom setlefttoprightbottom = new setLeftTopRightBottom(context, 0, i, i2, setlefttoprightbottom_menuhosthelper__externalsyntheticlambda1);
        this.setUnboundedRipple = setlefttoprightbottom;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = ((int) Math.pow(10.0d, setlefttoprightbottom.MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius - 1.0d)) - 1;
        this.setChipCornerRadius.setOnLongClickListener = true;
        setY();
        invalidateSelf();
        this.setChipCornerRadius.setOnLongClickListener = true;
        setY();
        invalidateSelf();
        this.setChipCornerRadius.setY.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setY.intValue());
        if (this.setIconSize.setChipIconTintResource.setX != valueOf) {
            setWebViewClient setwebviewclient = this.setIconSize;
            if (setwebviewclient.setChipIconTintResource.setX != valueOf) {
                setwebviewclient.setChipIconTintResource.setX = valueOf;
                setwebviewclient.onStateChange(setwebviewclient.getState());
            }
            invalidateSelf();
        }
        this.setChipCornerRadius.setY.setColor(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple.intValue());
        invalidateSelf();
        WeakReference<View> weakReference = this.setNavigationOnClickListener;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.setNavigationOnClickListener.get();
            WeakReference<FrameLayout> weakReference2 = this.setY;
            MenuHostHelper$$ExternalSyntheticLambda1(view, weakReference2 != null ? weakReference2.get() : null);
        }
        setY();
        setVisible(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1.booleanValue(), false);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, FrameLayout frameLayout) {
        this.setNavigationOnClickListener = new WeakReference<>(view);
        this.setY = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        setY();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        setLeftTopRightBottom setlefttoprightbottom = this.setUnboundedRipple;
        setlefttoprightbottom.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        setlefttoprightbottom.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setChipCornerRadius.setY.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.setLayoutAnimation.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.setLayoutAnimation.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.setIconSize.draw(canvas);
        if (this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1) {
            Rect rect = new Rect();
            String iconTintList = setIconTintList();
            this.setChipCornerRadius.setY.getTextBounds(iconTintList, 0, iconTintList.length(), rect);
            canvas.drawText(iconTintList, this.setOnLongClickListener, this.setUiOptions + (rect.height() / 2), this.setChipCornerRadius.setY);
        }
    }

    @Override // o.setReferencedIds.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, o.setReferencedIds.setY
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    private void setY() {
        Context context = this.MenuHostHelper$$ExternalSyntheticLambda1.get();
        WeakReference<View> weakReference = this.setNavigationOnClickListener;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.setLayoutAnimation);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.setY;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        MenuHostHelper$$ExternalSyntheticLambda1(context, rect2, view);
        setEndIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation, this.setOnLongClickListener, this.setUiOptions, this.ViewPager$SavedState$1, this.setCenterIfNoTextEnabled);
        setWebViewClient setwebviewclient = this.setIconSize;
        float f = this.setTextAlignment;
        setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(setwebviewclient.setChipIconTintResource.setTextAlignment);
        sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(f);
        sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(f);
        sety.setIconTintList = new setActionBarVisibilityCallback(f);
        sety.setY = new setActionBarVisibilityCallback(f);
        setwebviewclient.setShapeAppearanceModel(new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0));
        if (rect.equals(this.setLayoutAnimation)) {
            return;
        }
        this.setIconSize.setBounds(this.setLayoutAnimation);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(Context context, Rect rect, View view) {
        int intValue;
        float measureText;
        int intValue2;
        int x;
        float f;
        int x2;
        float f2;
        if (this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1) {
            intValue = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setAnimationFromJson.intValue();
        } else {
            intValue = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setOnNavigationItemSelectedListener.intValue();
        }
        int intValue3 = intValue + this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.intValue();
        int intValue4 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.intValue();
        if (intValue4 == 8388691 || intValue4 == 8388693) {
            this.setUiOptions = rect.bottom - intValue3;
        } else {
            this.setUiOptions = rect.top + intValue3;
        }
        if ((this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1 ? this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize : 0) <= 9) {
            float f3 = !(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1) ? this.setUnboundedRipple.setIconTintList : this.setUnboundedRipple.setX;
            this.setTextAlignment = f3;
            this.setCenterIfNoTextEnabled = f3;
            this.ViewPager$SavedState$1 = f3;
        } else {
            float f4 = this.setUnboundedRipple.setX;
            this.setTextAlignment = f4;
            this.setCenterIfNoTextEnabled = f4;
            String iconTintList = setIconTintList();
            setReferencedIds setreferencedids = this.setChipCornerRadius;
            if (!setreferencedids.setOnLongClickListener) {
                measureText = setreferencedids.setX;
            } else {
                measureText = iconTintList == null ? 0.0f : setreferencedids.setY.measureText((CharSequence) iconTintList, 0, iconTintList.length());
                setreferencedids.setX = measureText;
                setreferencedids.setOnLongClickListener = false;
            }
            this.ViewPager$SavedState$1 = (measureText / 2.0f) + this.setUnboundedRipple.setY;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1 ? R.dimen.res_0x7f070199 : R.dimen.res_0x7f070196);
        boolean z = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1;
        setLeftTopRightBottom setlefttoprightbottom = this.setUnboundedRipple;
        if (z) {
            intValue2 = setlefttoprightbottom.MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment.intValue();
        } else {
            intValue2 = setlefttoprightbottom.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.intValue();
        }
        int intValue5 = intValue2 + this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setX.intValue();
        int intValue6 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.intValue();
        if (intValue6 == 8388659 || intValue6 == 8388691) {
            x = setBaselineAlignBottom.setX.setX(view);
            if (x == 0) {
                f = (rect.left - this.ViewPager$SavedState$1) + dimensionPixelSize + intValue5;
            } else {
                f = ((rect.right + this.ViewPager$SavedState$1) - dimensionPixelSize) - intValue5;
            }
            this.setOnLongClickListener = f;
            return;
        }
        x2 = setBaselineAlignBottom.setX.setX(view);
        if (x2 == 0) {
            f2 = ((rect.right + this.ViewPager$SavedState$1) - dimensionPixelSize) - intValue5;
        } else {
            f2 = (rect.left - this.ViewPager$SavedState$1) + dimensionPixelSize + intValue5;
        }
        this.setOnLongClickListener = f2;
    }

    private String setIconTintList() {
        if ((this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1 ? this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize : 0) <= this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return NumberFormat.getInstance(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX).format(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1 ? this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize : 0);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1.get() == null ? "" : String.format(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX, "%1$d%2$s", Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), "+");
    }

    public final int setX() {
        if (this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize != -1) {
            return this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize;
        }
        return 0;
    }
}