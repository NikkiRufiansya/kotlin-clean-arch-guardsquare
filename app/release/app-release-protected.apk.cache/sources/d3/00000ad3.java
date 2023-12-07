package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o.setDecorPadding;

/* loaded from: classes.dex */
public class setCounterOverflowTextColor {
    private static final View.AccessibilityDelegate setX = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate MenuHostHelper$$ExternalSyntheticLambda1;
    private final View.AccessibilityDelegate setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends View.AccessibilityDelegate {
        final setCounterOverflowTextColor setIconTintList;

        setX(setCounterOverflowTextColor setcounteroverflowtextcolor) {
            this.setIconTintList = setcounteroverflowtextcolor;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.setIconTintList.setX(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.setIconTintList.setIconTintList(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            setDecorPadding y = setDecorPadding.setY(accessibilityNodeInfo);
            y.setNavigationOnClickListener(setBaselineAlignBottom.setContentScrimResource(view));
            y.setLayoutAnimation(setBaselineAlignBottom.SearchView$SavedState$1(view));
            y.setLayoutAnimation(setBaselineAlignBottom.setIconTintList(view));
            y.setUiOptions(setBaselineAlignBottom.setTextAppearanceResource(view));
            this.setIconTintList.setY(view, y);
            y.MenuHostHelper$$ExternalSyntheticLambda1(accessibilityNodeInfo.getText(), view);
            List<setDecorPadding.setIconTintList> x = setCounterOverflowTextColor.setX(view);
            for (int i = 0; i < x.size(); i++) {
                y.setIconTintList(x.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.setIconTintList.setY(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            setCompoundDrawablesRelativeWithIntrinsicBounds y = this.setIconTintList.setY(view);
            if (y != null) {
                return (AccessibilityNodeProvider) y.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(view, i, bundle);
        }
    }

    public setCounterOverflowTextColor() {
        this(setX);
    }

    public setCounterOverflowTextColor(View.AccessibilityDelegate accessibilityDelegate) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = accessibilityDelegate;
        this.setY = new setX(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.sendAccessibilityEvent(view, i);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(View view, AccessibilityEvent accessibilityEvent) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean setX(View view, AccessibilityEvent accessibilityEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(View view, AccessibilityEvent accessibilityEvent) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void setIconTintList(View view, AccessibilityEvent accessibilityEvent) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void setY(View view, setDecorPadding setdecorpadding) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.onInitializeAccessibilityNodeInfo(view, setdecorpadding.setGuidelinePercent());
    }

    public boolean setY(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public setCompoundDrawablesRelativeWithIntrinsicBounds setY(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.MenuHostHelper$$ExternalSyntheticLambda1.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new setCompoundDrawablesRelativeWithIntrinsicBounds(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, Bundle bundle) {
        List<setDecorPadding.setIconTintList> x = setX(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= x.size()) {
                break;
            }
            setDecorPadding.setIconTintList seticontintlist = x.get(i2);
            if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0() == i) {
                z = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = setY.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, view, i, bundle);
        }
        return (z || i != R.id.res_0x7f0a000f || bundle == null) ? z : setY(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    private boolean setY(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.res_0x7f0a01dc);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (setX(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    private boolean setX(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] x = setDecorPadding.setX(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; x != null && i < x.length; i++) {
                if (clickableSpan.equals(x[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    static List<setDecorPadding.setIconTintList> setX(View view) {
        List<setDecorPadding.setIconTintList> list = (List) view.getTag(R.id.res_0x7f0a01db);
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        static boolean setIconTintList(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }
}