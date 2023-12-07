package o;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setUiOptions(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setNavigationOnClickListener(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setX(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setIconTintList(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setUnboundedRipple(View view) {
        return view.hasOverlappingRendering();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}