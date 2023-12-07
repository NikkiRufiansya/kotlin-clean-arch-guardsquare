package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public class Parcelable$ClassLoaderCreator extends setCounterOverflowTextColor {
    final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 MenuHostHelper$$ExternalSyntheticLambda1;
    final Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 setX;

    public Parcelable$ClassLoaderCreator(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
        Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 = this.setX;
        if (parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 != null && (parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 instanceof Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0)) {
            this.setX = parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0;
        } else {
            this.setX = new Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0(this);
        }
    }

    @Override // o.setCounterOverflowTextColor
    public boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, Bundle bundle) {
        if (super.MenuHostHelper$$ExternalSyntheticLambda1(view, i, bundle)) {
            return true;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1() || this.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent == null) {
            return false;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent;
        return setuioptions.MenuHostHelper$$ExternalSyntheticLambda0(setuioptions.setMaxEms.setContentScrimResource, setuioptions.setMaxEms.setViewTranslationCallback, i, bundle);
    }

    @Override // o.setCounterOverflowTextColor
    public void setY(View view, setDecorPadding setdecorpadding) {
        super.setY(view, setdecorpadding);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1() || this.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent == null) {
            return;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent;
        setuioptions.MenuHostHelper$$ExternalSyntheticLambda0(setuioptions.setMaxEms.setContentScrimResource, setuioptions.setMaxEms.setViewTranslationCallback, setdecorpadding);
    }

    @Override // o.setCounterOverflowTextColor
    public void setIconTintList(View view, AccessibilityEvent accessibilityEvent) {
        super.setIconTintList(view, accessibilityEvent);
        if (!(view instanceof WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) || this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1()) {
            return;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) view;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setGuidelinePercent != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda0(accessibilityEvent);
        }
    }
}