package o;

import android.os.Bundle;
import o.registerIn;
import o.setPlaceholderTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setEnableEffect implements ComponentActivity$5, setFillViewport, setPictureListener {
    private final setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda0;
    private final setTabRippleColorResource setY;
    setAdjustViewBounds setX = null;
    setChildDivider setIconTintList = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEnableEffect(setDropDownBackgroundResource setdropdownbackgroundresource, setTabRippleColorResource settabripplecolorresource) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setdropdownbackgroundresource;
        this.setY = settabripplecolorresource;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        if (this.setX == null) {
            this.setX = new setAdjustViewBounds(this);
            pN.setY(this, "");
            this.setIconTintList = new setChildDivider(this, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setX() {
        return this.setX != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX setx) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(setx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(bundle);
    }

    @Override // o.ComponentActivity$5
    public final /* synthetic */ setPlaceholderTextColor setY() {
        return setPlaceholderTextColor.setX.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setTouchDelegate
    public final registerIn MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setX == null) {
            this.setX = new setAdjustViewBounds(this);
            pN.setY(this, "");
            this.setIconTintList = new setChildDivider(this, (byte) 0);
        }
        return this.setX;
    }

    @Override // o.setFillViewport
    public final setCompoundDrawablePadding setNavigationOnClickListener() {
        if (this.setX == null) {
            this.setX = new setAdjustViewBounds(this);
            pN.setY(this, "");
            this.setIconTintList = new setChildDivider(this, (byte) 0);
        }
        return this.setIconTintList.setX;
    }

    @Override // o.setPictureListener
    public final setTabRippleColorResource setUnboundedRipple() {
        if (this.setX == null) {
            this.setX = new setAdjustViewBounds(this);
            pN.setY(this, "");
            this.setIconTintList = new setChildDivider(this, (byte) 0);
        }
        return this.setY;
    }
}