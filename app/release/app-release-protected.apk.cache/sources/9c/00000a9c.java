package o;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class setCompoundDrawablesRelativeWithIntrinsicBounds {
    private final Object setY;

    public setDecorPadding MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return null;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(int i, setDecorPadding setdecorpadding, String str, Bundle bundle) {
    }

    public setDecorPadding MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return null;
    }

    public boolean setIconTintList(int i, int i2, Bundle bundle) {
        return false;
    }

    public List<setDecorPadding> setX(String str, int i) {
        return null;
    }

    /* loaded from: classes.dex */
    static class setX extends AccessibilityNodeProvider {
        final setCompoundDrawablesRelativeWithIntrinsicBounds MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setcompounddrawablesrelativewithintrinsicbounds;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            setDecorPadding MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                return null;
            }
            return MenuHostHelper$$ExternalSyntheticLambda0.setGuidelinePercent();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<setDecorPadding> x = this.MenuHostHelper$$ExternalSyntheticLambda0.setX(str, i);
            if (x == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = x.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(x.get(i2).setGuidelinePercent());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(i, i2, bundle);
        }
    }

    public setCompoundDrawablesRelativeWithIntrinsicBounds() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.setY = new setCompoundDrawablesRelativeWithIntrinsicBounds$MenuHostHelper$$ExternalSyntheticLambda0(this) { // from class: o.setCompoundDrawablesRelativeWithIntrinsicBounds$MenuHostHelper$$ExternalSyntheticLambda1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(this);
                }

                @Override // android.view.accessibility.AccessibilityNodeProvider
                public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, setDecorPadding.setY(accessibilityNodeInfo), str, bundle);
                }
            };
        } else {
            this.setY = new setCompoundDrawablesRelativeWithIntrinsicBounds$MenuHostHelper$$ExternalSyntheticLambda0(this);
        }
    }

    public setCompoundDrawablesRelativeWithIntrinsicBounds(Object obj) {
        this.setY = obj;
    }

    public Object MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }
}