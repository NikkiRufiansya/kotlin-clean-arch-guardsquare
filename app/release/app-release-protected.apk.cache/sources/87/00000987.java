package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class setBaselineAligned extends setKeyListener implements get {
    private final setNextFocusLeftId setOnLongClickListener;

    public setBaselineAligned(Context context) {
        this(context, null);
    }

    public setBaselineAligned(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setOnLongClickListener = new setNextFocusLeftId(this);
    }

    @Override // o.get
    public final void setIconTintList() {
        this.setOnLongClickListener.setIconTintList();
    }

    @Override // o.get
    public final void setX() {
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.get
    public void setRevealInfo(get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1) {
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(get_menuhosthelper__externalsyntheticlambda1);
    }

    @Override // o.get
    public final get$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.get
    public void setCircularRevealScrimColor(int i) {
        setNextFocusLeftId setnextfocusleftid = this.setOnLongClickListener;
        setnextfocusleftid.MenuHostHelper$$ExternalSyntheticLambda1.setColor(i);
        setnextfocusleftid.setIconTintList.invalidate();
    }

    @Override // o.get
    public final int setY() {
        return this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1.getColor();
    }

    @Override // o.get
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        setNextFocusLeftId setnextfocusleftid = this.setOnLongClickListener;
        setnextfocusleftid.setX = drawable;
        setnextfocusleftid.setIconTintList.invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        setNextFocusLeftId setnextfocusleftid = this.setOnLongClickListener;
        if (setnextfocusleftid != null) {
            setnextfocusleftid.MenuHostHelper$$ExternalSyntheticLambda1(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // o.setNextFocusLeftId$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setIconTintList(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        setNextFocusLeftId setnextfocusleftid = this.setOnLongClickListener;
        if (setnextfocusleftid != null) {
            return setnextfocusleftid.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1() && !setnextfocusleftid.setX();
        }
        return super.isOpaque();
    }

    @Override // o.setNextFocusLeftId$MenuHostHelper$$ExternalSyntheticLambda0
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return super.isOpaque();
    }
}