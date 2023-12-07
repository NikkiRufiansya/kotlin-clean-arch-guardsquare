package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.Drawable;
import o.getFillColor;

/* loaded from: classes.dex */
public class FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1 implements getFillColor {
    private /* synthetic */ FloatingActionButton setX;

    public FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(FloatingActionButton floatingActionButton) {
        this.setX = floatingActionButton;
    }

    @Override // o.getFillColor
    public final void setY(int i, int i2, int i3, int i4) {
        this.setX.setY.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = this.setX;
        floatingActionButton.setPadding(i + floatingActionButton.setX, i2 + this.setX.setX, i3 + this.setX.setX, i4 + this.setX.setX);
    }

    @Override // o.getFillColor
    public final void setX(Drawable drawable) {
        if (drawable != null) {
            super/*o.setMax*/.setBackgroundDrawable(drawable);
        }
    }

    @Override // o.getFillColor
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX.setIconTintList;
    }
}