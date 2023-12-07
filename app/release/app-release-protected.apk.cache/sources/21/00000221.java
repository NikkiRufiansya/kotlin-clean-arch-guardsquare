package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public class Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 extends setCounterOverflowTextColor {
    final Parcelable$ClassLoaderCreator MenuHostHelper$$ExternalSyntheticLambda0;
    Map<View, setCounterOverflowTextColor> MenuHostHelper$$ExternalSyntheticLambda1 = new WeakHashMap();

    public Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0(Parcelable$ClassLoaderCreator parcelable$ClassLoaderCreator) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcelable$ClassLoaderCreator;
    }

    @Override // o.setCounterOverflowTextColor
    public final void setY(View view, setDecorPadding setdecorpadding) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1() && this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent.setY(view, setdecorpadding);
            setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
            if (setcounteroverflowtextcolor != null) {
                setcounteroverflowtextcolor.setY(view, setdecorpadding);
                return;
            } else {
                super.setY(view, setdecorpadding);
                return;
            }
        }
        super.setY(view, setdecorpadding);
    }

    @Override // o.setCounterOverflowTextColor
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, Bundle bundle) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1() && this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent != null) {
            setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
            if (setcounteroverflowtextcolor != null) {
                if (setcounteroverflowtextcolor.MenuHostHelper$$ExternalSyntheticLambda1(view, i, bundle)) {
                    return true;
                }
            } else if (super.MenuHostHelper$$ExternalSyntheticLambda1(view, i, bundle)) {
                return true;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems = setuioptions.setMaxEms.setContentScrimResource;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress = setuioptions.setMaxEms.setViewTranslationCallback;
            return false;
        }
        return super.MenuHostHelper$$ExternalSyntheticLambda1(view, i, bundle);
    }

    @Override // o.setCounterOverflowTextColor
    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
        if (setcounteroverflowtextcolor != null) {
            setcounteroverflowtextcolor.MenuHostHelper$$ExternalSyntheticLambda1(view, i);
        } else {
            super.MenuHostHelper$$ExternalSyntheticLambda1(view, i);
        }
    }

    @Override // o.setCounterOverflowTextColor
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, AccessibilityEvent accessibilityEvent) {
        setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
        if (setcounteroverflowtextcolor != null) {
            setcounteroverflowtextcolor.MenuHostHelper$$ExternalSyntheticLambda0(view, accessibilityEvent);
        } else {
            super.MenuHostHelper$$ExternalSyntheticLambda0(view, accessibilityEvent);
        }
    }

    @Override // o.setCounterOverflowTextColor
    public final boolean setX(View view, AccessibilityEvent accessibilityEvent) {
        setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
        if (setcounteroverflowtextcolor != null) {
            return setcounteroverflowtextcolor.setX(view, accessibilityEvent);
        }
        return super.setX(view, accessibilityEvent);
    }

    @Override // o.setCounterOverflowTextColor
    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, AccessibilityEvent accessibilityEvent) {
        setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
        if (setcounteroverflowtextcolor != null) {
            setcounteroverflowtextcolor.MenuHostHelper$$ExternalSyntheticLambda1(view, accessibilityEvent);
        } else {
            super.MenuHostHelper$$ExternalSyntheticLambda1(view, accessibilityEvent);
        }
    }

    @Override // o.setCounterOverflowTextColor
    public final void setIconTintList(View view, AccessibilityEvent accessibilityEvent) {
        setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
        if (setcounteroverflowtextcolor != null) {
            setcounteroverflowtextcolor.setIconTintList(view, accessibilityEvent);
        } else {
            super.setIconTintList(view, accessibilityEvent);
        }
    }

    @Override // o.setCounterOverflowTextColor
    public final boolean setY(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(viewGroup);
        if (setcounteroverflowtextcolor != null) {
            return setcounteroverflowtextcolor.setY(viewGroup, view, accessibilityEvent);
        }
        return super.setY(viewGroup, view, accessibilityEvent);
    }

    @Override // o.setCounterOverflowTextColor
    public final setCompoundDrawablesRelativeWithIntrinsicBounds setY(View view) {
        setCounterOverflowTextColor setcounteroverflowtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.get(view);
        if (setcounteroverflowtextcolor != null) {
            return setcounteroverflowtextcolor.setY(view);
        }
        return super.setY(view);
    }
}