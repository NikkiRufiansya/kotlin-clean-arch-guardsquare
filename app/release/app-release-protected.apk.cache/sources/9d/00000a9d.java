package o;

import android.view.accessibility.AccessibilityNodeInfo;
import o.setCompoundDrawablesRelativeWithIntrinsicBounds;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setCompoundDrawablesRelativeWithIntrinsicBounds$MenuHostHelper$$ExternalSyntheticLambda0 extends setCompoundDrawablesRelativeWithIntrinsicBounds.setX {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setCompoundDrawablesRelativeWithIntrinsicBounds$MenuHostHelper$$ExternalSyntheticLambda0(setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds) {
        super(setcompounddrawablesrelativewithintrinsicbounds);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i) {
        setDecorPadding MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(i);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return null;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent();
    }
}