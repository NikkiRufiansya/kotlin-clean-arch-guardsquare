package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import o.setAnimationFromJson;
import o.setBaselineAlignBottom;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
class setOnGroupClickListener extends setIndeterminateTintList {
    private Drawable MenuHostHelper$$ExternalSyntheticLambda0;
    private PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private final SeekBar setOnLongClickListener;
    private boolean setX;
    private ColorStateList setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnGroupClickListener(SeekBar seekBar) {
        super(seekBar);
        this.setY = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        this.setIconTintList = false;
        this.setX = false;
        this.setOnLongClickListener = seekBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setIndeterminateTintList
    public void MenuHostHelper$$ExternalSyntheticLambda0(AttributeSet attributeSet, int i) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener.getContext(), attributeSet, setAnimationFromJson.setY.setSelectedChildViewEnabled, i, 0);
        SeekBar seekBar = this.setOnLongClickListener;
        setBaselineAlignBottom.setY(seekBar, seekBar.getContext(), setAnimationFromJson.setY.setSelectedChildViewEnabled, attributeSet, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), i, 0);
        Drawable x = MenuHostHelper$$ExternalSyntheticLambda0.setX(setAnimationFromJson.setY.setFloatValues);
        if (x != null) {
            this.setOnLongClickListener.setThumb(x);
        }
        MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setImageTintMode));
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setShrinkMotionSpec)) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setCheckMarkDrawable.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setShrinkMotionSpec, -1), this.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setX = true;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setError)) {
            this.setY = MenuHostHelper$$ExternalSyntheticLambda0.setY(setAnimationFromJson.setY.setError);
            this.setIconTintList = true;
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        int x;
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this.setOnLongClickListener);
            x = setBaselineAlignBottom.setX.setX(this.setOnLongClickListener);
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable, x);
            if (drawable.isStateful()) {
                drawable.setState(this.setOnLongClickListener.getDrawableState());
            }
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        this.setOnLongClickListener.invalidate();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable != null) {
            if (this.setIconTintList || this.setX) {
                Drawable navigationOnClickListener = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable.mutate());
                this.MenuHostHelper$$ExternalSyntheticLambda0 = navigationOnClickListener;
                if (this.setIconTintList) {
                    setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(navigationOnClickListener, this.setY);
                }
                if (this.setX) {
                    setEnsureMinTouchTargetSize.setX(this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                if (this.MenuHostHelper$$ExternalSyntheticLambda0.isStateful()) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setState(this.setOnLongClickListener.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY() {
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1() {
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.setOnLongClickListener.getDrawableState())) {
            this.setOnLongClickListener.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(Canvas canvas) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            int max = this.setOnLongClickListener.getMax();
            if (max > 1) {
                int intrinsicWidth = this.MenuHostHelper$$ExternalSyntheticLambda0.getIntrinsicWidth();
                int intrinsicHeight = this.MenuHostHelper$$ExternalSyntheticLambda0.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setBounds(-i, -i2, i, i2);
                float width = ((this.setOnLongClickListener.getWidth() - this.setOnLongClickListener.getPaddingLeft()) - this.setOnLongClickListener.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.setOnLongClickListener.getPaddingLeft(), this.setOnLongClickListener.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}